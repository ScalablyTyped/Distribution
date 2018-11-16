package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComponentCreated extends js.Object {
  /**
        * Implement this hook if you want to perform custom logic after the constructor has been called.
        * At this point in time, the view has also been created and both the view-model and the view
        * are connected to their controller. The hook will recieve the instance of the "owningView".
        * This is the view that the component is declared inside of. If the component itself has a view,
        * this will be passed second.
        */
  def created(owningView: View, myView: View): scala.Unit
}

