package typings
package atAntDashDesignIconsDashAngularLib.atAntDashDesignIconsDashAngularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val antIconConsolePrefix: atAntDashDesignIconsDashAngularLib.atAntDashDesignIconsDashAngularLibStrings.`[@ant-design/icons-angular]: ` = js.native
  val manifest: atAntDashDesignIconsDashAngularLib.typesMod.Manifest = js.native
  def HttpModuleNotImport(): scala.Null = js.native
  def IconNotFoundError(icon: java.lang.String): stdLib.Error = js.native
  def NameSpaceIsNotSpecifyError(): stdLib.Error = js.native
  def SVGTagNotFoundError(): stdLib.Error = js.native
  def UrlNotSafeError(url: java.lang.String): stdLib.Error = js.native
  def alreadyHasAThemeSuffix(name: java.lang.String): scala.Boolean = js.native
  def cloneSVG(svg: stdLib.SVGElement): stdLib.SVGElement = js.native
  def getIconDefinitionFromAbbr(str: java.lang.String): atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition = js.native
  def getNameAndNamespace(`type`: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def getSecondaryColor(primaryColor: java.lang.String): java.lang.String = js.native
  def hasNamespace(`type`: java.lang.String): scala.Boolean = js.native
  def isIconDefinition(target: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ scala.Boolean = js.native
  def isIconDefinition(target: java.lang.String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ scala.Boolean = js.native
  def mapAbbrToTheme(abbr: java.lang.String): atAntDashDesignIconsDashAngularLib.typesMod.ThemeType = js.native
  def printErr(message: java.lang.String): scala.Unit = js.native
  def printWarn(message: java.lang.String): scala.Unit = js.native
  def replaceFillColor(raw: java.lang.String): java.lang.String = js.native
  def withSuffix(name: java.lang.String): java.lang.String = js.native
  def withSuffix(name: java.lang.String, theme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType): java.lang.String = js.native
  def withSuffixAndColor(
    name: java.lang.String,
    theme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType,
    pri: java.lang.String,
    sec: java.lang.String
  ): java.lang.String = js.native
}

