package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBarStore extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Store: activexDashOutlookLib.OutlookNs.Store
}

object Anon_CommandBarStore {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Store: activexDashOutlookLib.OutlookNs.Store
  ): Anon_CommandBarStore = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar, Store = Store)
  
    __obj.asInstanceOf[Anon_CommandBarStore]
  }
}

