package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.DoCheck
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgClass")
@js.native
class NgClass protected ()
  extends NgClassBase
     with DoCheck {
  def this(delegate: ɵNgClassImpl) = this()
  var klass: String = js.native
  var ngClass: String | js.Array[String] | Set[String] | StringDictionary[js.Any] = js.native
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

