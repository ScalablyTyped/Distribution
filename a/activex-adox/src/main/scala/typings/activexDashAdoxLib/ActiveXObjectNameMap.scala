package typings
package activexDashAdoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ADOX.Catalog`: activexDashAdoxLib.ADOXNs.Catalog
  var `ADOX.Column`: activexDashAdoxLib.ADOXNs.Column
  var `ADOX.Group`: activexDashAdoxLib.ADOXNs.Group
  var `ADOX.Index`: activexDashAdoxLib.ADOXNs.Index
  var `ADOX.Key`: activexDashAdoxLib.ADOXNs.Key
  var `ADOX.Table`: activexDashAdoxLib.ADOXNs.Table
  var `ADOX.User`: activexDashAdoxLib.ADOXNs.User
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ADOX.Catalog`: activexDashAdoxLib.ADOXNs.Catalog,
    `ADOX.Column`: activexDashAdoxLib.ADOXNs.Column,
    `ADOX.Group`: activexDashAdoxLib.ADOXNs.Group,
    `ADOX.Index`: activexDashAdoxLib.ADOXNs.Index,
    `ADOX.Key`: activexDashAdoxLib.ADOXNs.Key,
    `ADOX.Table`: activexDashAdoxLib.ADOXNs.Table,
    `ADOX.User`: activexDashAdoxLib.ADOXNs.User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADOX.Catalog")(`ADOX.Catalog`)
    __obj.updateDynamic("ADOX.Column")(`ADOX.Column`)
    __obj.updateDynamic("ADOX.Group")(`ADOX.Group`)
    __obj.updateDynamic("ADOX.Index")(`ADOX.Index`)
    __obj.updateDynamic("ADOX.Key")(`ADOX.Key`)
    __obj.updateDynamic("ADOX.Table")(`ADOX.Table`)
    __obj.updateDynamic("ADOX.User")(`ADOX.User`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

