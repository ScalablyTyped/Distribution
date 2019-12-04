package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemIndexDotNativeMod {
  import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.onBlur
  import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.onChange
  import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.onFocus
  import typings.reactDashNative.reactDashNativeMod.TextInputProperties
  import typings.utilityDashTypes.distMappedDashTypesMod.Omit

  type TextInputProps = Omit[TextInputProperties, onChange | onFocus | onBlur]
}
