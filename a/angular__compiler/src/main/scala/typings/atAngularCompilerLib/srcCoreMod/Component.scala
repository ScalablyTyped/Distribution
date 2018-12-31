package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends Directive {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var interpolation: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  var styleUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.undefined
}

