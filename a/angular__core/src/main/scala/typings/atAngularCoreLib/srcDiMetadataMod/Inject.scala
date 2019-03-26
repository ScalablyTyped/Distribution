package typings
package atAngularCoreLib.srcDiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inject extends js.Object {
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  var token: js.Any
}

@JSImport("@angular/core/src/di/metadata", "Inject")
@js.native
class InjectCls protected () extends Inject {
  def this(token: js.Any) = this()
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  /* CompleteClass */
  override var token: js.Any = js.native
}

object Inject {
  @scala.inline
  def apply(token: js.Any): Inject = {
    val __obj = js.Dynamic.literal(token = token)
  
    __obj.asInstanceOf[Inject]
  }
}

