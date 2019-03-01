package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof adone.adone.archive.tar.I.Header ]:? adone.adone.archive.tar.I.Header[P]} */ trait OptionalHeader extends js.Object {
  /**
    * File path
    */
  var name: java.lang.String
}

object OptionalHeader {
  @scala.inline
  def apply(name: java.lang.String): OptionalHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OptionalHeader]
  }
}

