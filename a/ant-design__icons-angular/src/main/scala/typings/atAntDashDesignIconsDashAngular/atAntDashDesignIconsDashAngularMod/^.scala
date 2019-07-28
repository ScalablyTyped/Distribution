package typings.atAntDashDesignIconsDashAngular.atAntDashDesignIconsDashAngularMod

import typings.atAntDashDesignIconsDashAngular.atAntDashDesignIconsDashAngularStrings.`[@ant-design/icons-angular]: `
import typings.atAntDashDesignIconsDashAngular.typesMod.IconDefinition
import typings.atAntDashDesignIconsDashAngular.typesMod.Manifest
import typings.atAntDashDesignIconsDashAngular.typesMod.ThemeType
import typings.std.Error
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val antIconConsolePrefix: `[@ant-design/icons-angular]: ` = js.native
  val manifest: Manifest = js.native
  def HttpModuleNotImport(): Null = js.native
  def IconNotFoundError(icon: String): Error = js.native
  def NameSpaceIsNotSpecifyError(): Error = js.native
  def SVGTagNotFoundError(): Error = js.native
  def UrlNotSafeError(url: String): Error = js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def hasNamespace(`type`: String): Boolean = js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  def printErr(message: String): Unit = js.native
  def printWarn(message: String): Unit = js.native
  def replaceFillColor(raw: String): String = js.native
  def withSuffix(name: String): String = js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}

