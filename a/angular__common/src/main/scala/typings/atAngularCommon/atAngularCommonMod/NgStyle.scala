package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.atAngularCoreMod.DoCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgStyle")
@js.native
class NgStyle protected ()
  extends NgStyleBase
     with DoCheck {
  def this(delegate: ɵNgStyleImpl) = this()
  var ngStyle: StringDictionary[js.Any] | Null = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
}

