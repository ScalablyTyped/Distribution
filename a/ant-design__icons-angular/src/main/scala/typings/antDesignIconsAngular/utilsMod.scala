package typings.antDesignIconsAngular

import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons-angular/utils", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "alreadyHasAThemeSuffix")
  @js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "cloneSVG")
  @js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "error")
  @js.native
  def error(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "getIconDefinitionFromAbbr")
  @js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "getNameAndNamespace")
  @js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "getSecondaryColor")
  @js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "hasNamespace")
  @js.native
  def hasNamespace(`type`: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "isIconDefinition")
  @js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  @JSImport("@ant-design/icons-angular/utils", "isIconDefinition")
  @js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "mapAbbrToTheme")
  @js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "replaceFillColor")
  @js.native
  def replaceFillColor(raw: String): String = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "withSuffix")
  @js.native
  def withSuffix(name: String): String = js.native
  @JSImport("@ant-design/icons-angular/utils", "withSuffix")
  @js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "withSuffixAndColor")
  @js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}
