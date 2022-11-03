package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.atlaskitTokensStrings.deleted
import typings.atlaskitTokens.atlaskitTokensStrings.deprecated
import typings.atlaskitTokens.atlaskitTokensStrings.experimental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArtifactsRenameMappingAtlassianLightMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/rename-mapping/atlassian-light", JSImport.Default)
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
    
    extension [Self <: RenameMap](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: Token): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setState(value: experimental | deprecated | deleted): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot0
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot150
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot250
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot500
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot600
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot025
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot050
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot075
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot0
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot400
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot500
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot600
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot700
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot800
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot900
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot1000
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleLinearDot1100
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot0
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot2
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot4
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot6
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot8
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot12
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot16
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot20
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot24
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot32
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot40
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotpixelDot48
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotnone
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxxxSmall
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxxSmall
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxSmall
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxsmall
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotsmall
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotmedium
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotlarge
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxlarge
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxlarge
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxxlarge
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotsizeDotxxxxlarge
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotelementDot2
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotelementDot4
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotelementDot6
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotelementDot8
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotcontainerDot12
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotcontainerDot16
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotcontainerDot20
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotcontainerDot24
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotlayoutDot32
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotlayoutDot40
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDoteclDotlayoutDot64
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcomponentDot2
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcomponentDot4
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcomponentDot6
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcomponentDot8
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontentDot12
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontentDot16
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontentDot20
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontentDot24
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontainerDot32
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontainerDot40
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotcccDotcontainerDot48
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotgapDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotgapDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotgapDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotinsetDot100
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotinsetDot200
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingDotinsetDot300
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblueDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotredDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorangeDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellowDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreenDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurpleDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDottealDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagentaDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgrayDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottext
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarningDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDothighEmphasis
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlinkDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlinkDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlowEmphasis
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotmediumEmphasis
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotonBold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotonBoldWarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticon
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarningDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgray
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotfocused
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinput
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinformation
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotfocus
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotneutral
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotred
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellow
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotteal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtlest
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtler
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotbolder
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverse
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinput
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutral
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotbold
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDothover
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
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotblanket
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotcard
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdefault
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBorderedNeutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBorderedNeutralDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDotresting
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsunken
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDottransparentNeutralDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDottransparentNeutralDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanket
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotselected
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotinverseDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotinverseDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotskeleton
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotskeletonDotsubtle
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotlink
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotlinkDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldBlue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldGreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldOrange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldPurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldRed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldTeal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleBlue
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleGreen
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleMagenta
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleOrange
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtlePurple
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleRed
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleTeal
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotbrand
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotdanger
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotdiscovery
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotsuccess
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotwarning
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotoverlayDothover
    - typings.atlaskitTokens.atlaskitTokensStrings.colorDotoverlayDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.shadowDotcard
    - typings.atlaskitTokens.atlaskitTokensStrings.shadowDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotraised
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverflow
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurface
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotsunken
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraised
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlay
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDothovered
    - typings.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDotpressed
    - typings.atlaskitTokens.atlaskitTokensStrings.opacityDotdisabled
    - typings.atlaskitTokens.atlaskitTokensStrings.opacityDotloading
    - typings.atlaskitTokens.atlaskitTokensStrings.utilityDotUNSAFE_utilDottransparent
    - typings.atlaskitTokens.atlaskitTokensStrings.utilityDotUNSAFE_utilDotMISSING_TOKEN
    - java.lang.String
  */
  type Token = _Token | String
  
  type _To = js.Array[RenameMap]
  
  trait _Token extends StObject
  
  /* This means you don't have to write `default`, but can instead just say `distTypesArtifactsRenameMappingAtlassianLightMod.foo` */
  override def _to: js.Array[RenameMap] = default
}
