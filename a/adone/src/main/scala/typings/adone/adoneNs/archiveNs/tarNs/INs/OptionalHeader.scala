package typings.adone.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof adone.adone.archive.tar.I.Header ]:? adone.adone.archive.tar.I.Header[P]} */ trait OptionalHeader extends js.Object {
  /**
    * File path
    */
  var name: String
}

object OptionalHeader {
  @scala.inline
  def apply(name: String): OptionalHeader = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[OptionalHeader]
  }
}

