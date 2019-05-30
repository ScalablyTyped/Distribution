package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgClass")
@js.native
class NgClass protected ()
  extends NgClassBase
     with atAngularCoreLib.atAngularCoreMod.DoCheck {
  def this(delegate: ɵNgClassImpl) = this()
  var klass: java.lang.String = js.native
  var ngClass: java.lang.String | js.Array[java.lang.String] | stdLib.Set[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
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

