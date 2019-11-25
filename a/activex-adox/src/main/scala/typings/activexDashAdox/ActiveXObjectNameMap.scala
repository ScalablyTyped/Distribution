package typings.activexDashAdox

import typings.activexDashAdox.ADOX.Catalog
import typings.activexDashAdox.ADOX.Column
import typings.activexDashAdox.ADOX.Group
import typings.activexDashAdox.ADOX.Index
import typings.activexDashAdox.ADOX.Key
import typings.activexDashAdox.ADOX.Table
import typings.activexDashAdox.ADOX.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ADOX.Catalog`: Catalog
  var `ADOX.Column`: Column
  var `ADOX.Group`: Group
  var `ADOX.Index`: Index
  var `ADOX.Key`: Key
  var `ADOX.Table`: Table
  var `ADOX.User`: User
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ADOX.Catalog`: Catalog,
    `ADOX.Column`: Column,
    `ADOX.Group`: Group,
    `ADOX.Index`: Index,
    `ADOX.Key`: Key,
    `ADOX.Table`: Table,
    `ADOX.User`: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADOX.Catalog")(`ADOX.Catalog`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Column")(`ADOX.Column`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Group")(`ADOX.Group`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Index")(`ADOX.Index`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Key")(`ADOX.Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Table")(`ADOX.Table`.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.User")(`ADOX.User`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

