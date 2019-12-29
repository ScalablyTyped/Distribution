package typings.atAntDashDesignIconsDashAngular

import typings.atAntDashDesignIconsDashAngular.atAntDashDesignIconsDashAngularStrings.`Leftsquarebracket@ant-designSlashicons-angularRightsquarebracketColon`
import typings.atAntDashDesignIconsDashAngular.typesMod.IconDefinition
import typings.atAntDashDesignIconsDashAngular.typesMod.ThemeType
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: `Leftsquarebracket@ant-designSlashicons-angularRightsquarebracketColon` = js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  def error(message: String): Unit = js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def hasNamespace(`type`: String): Boolean = js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  def replaceFillColor(raw: String): String = js.native
  def warn(message: String): Unit = js.native
  def withSuffix(name: String): String = js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}

