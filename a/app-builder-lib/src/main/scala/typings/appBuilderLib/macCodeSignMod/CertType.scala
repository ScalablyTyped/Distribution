package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application`
  - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer`
  - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application`
  - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer`
  - typings.appBuilderLib.appBuilderLibStrings.`Mac Developer`
*/
trait CertType extends js.Object

object CertType {
  @scala.inline
  def `3rd Party Mac Developer Application`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application` = this.cast("3rd Party Mac Developer Application")
  @scala.inline
  def `3rd Party Mac Developer Installer`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer` = this.cast("3rd Party Mac Developer Installer")
  @scala.inline
  def `Developer ID Application`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application` = this.cast("Developer ID Application")
  @scala.inline
  def `Developer ID Installer`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer` = this.cast("Developer ID Installer")
  @scala.inline
  def `Mac Developer`: typings.appBuilderLib.appBuilderLibStrings.`Mac Developer` = this.cast("Mac Developer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

