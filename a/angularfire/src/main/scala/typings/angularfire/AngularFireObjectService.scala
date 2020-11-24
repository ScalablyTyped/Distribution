package typings.angularfire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularFireObjectService extends js.Object {
  
  @JSName("$extend")
  def $extend(ChildClass: js.Object): js.Object = js.native
  @JSName("$extend")
  def $extend(ChildClass: js.Object, methods: js.Object): js.Object = js.native
  
  /**
    * Creates a synchronized object with 2-way bindings between Angular and Firebase.
    *
    * @param {Firebase} ref
    * @returns {FirebaseObject}
    */
  def apply(
    firebase: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ): AngularFireObject = js.native
}
