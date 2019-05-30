package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgStyle")
@js.native
class NgStyle protected ()
  extends NgStyleBase
     with atAngularCoreLib.atAngularCoreMod.DoCheck {
  def this(delegate: ɵNgStyleImpl) = this()
  var ngStyle: org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): scala.Unit = js.native
}

