package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.atlaskitTokensStrings.deleted
import typings.atlaskitTokens.atlaskitTokensStrings.deprecated
import typings.atlaskitTokens.atlaskitTokensStrings.experimental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArtifactsReplacementMappingMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/replacement-mapping", JSImport.Default)
  @js.native
  val default: js.Array[RenameMap] = js.native
  
  trait RenameMap extends StObject {
    
    var path: String
    
    var replacement: Token
    
    var state: experimental | deprecated | deleted
  }
  object RenameMap {
    
    inline def apply(path: String, replacement: Token, state: experimental | deprecated | deleted): RenameMap = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenameMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenameMap] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: Token): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setState(value: experimental | deprecated | deleted): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot050
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDotround
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotwidthDot0
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotwidthDot050
    - typings.atlaskitTokens.atlaskitTokensStrings.borderDotwidthDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottext
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotredDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorangeDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellowDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreenDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDottealDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblueDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurpleDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagentaDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgrayDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarningDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotlink
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotlinkDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticon
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarningDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotfocused
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinput
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinput
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutral
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanket
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotskeleton
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotskeletonDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot1
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot1Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot2
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot2Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot3
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot3Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot4
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot4Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot5
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot5Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot6
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot6Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot7
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot7Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot8
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotcategoricalDot8Dothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotneutral
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotneutralDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotredDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotorangeDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotyellowDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgreenDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDottealDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotblueDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotpurpleDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotmagentaDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotbolderDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotboldest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotgrayDotboldestDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotbrandDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdangerDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdangerDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdangerDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotwarningDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotwarningDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotwarningDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotsuccessDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotsuccessDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotsuccessDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdiscoveryDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdiscoveryDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotdiscoveryDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotinformationDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotinformationDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotchartDotinformationDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurface
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraised
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotsunken
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverflow
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverflowDotperimeter
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverflowDotspread
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotraised
    - typings.atlaskitTokens.atlaskitTokensStrings.opacityDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.opacityDotloading
    - typings.atlaskitTokens.atlaskitTokensStrings.utilityDotUNSAFEDottransparent
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot0
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot025
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot050
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot075
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot150
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot250
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot500
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot600
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot800
    - typings.atlaskitTokens.atlaskitTokensStrings.spaceDot1000
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotfamilyDotmonospace
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotfamilyDotsans
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot050
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot075
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot500
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotsizeDot600
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotweightDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotweightDotmedium
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotweightDotregular
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotweightDotsemibold
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot500
    - typings.atlaskitTokens.atlaskitTokensStrings.fontDotlineHeightDot600
    - java.lang.String
  */
  type Token = _Token | String
  
  type _To = js.Array[RenameMap]
  
  trait _Token extends StObject
  
  /* This means you don't have to write `default`, but can instead just say `distTypesArtifactsReplacementMappingMod.foo` */
  override def _to: js.Array[RenameMap] = default
}
