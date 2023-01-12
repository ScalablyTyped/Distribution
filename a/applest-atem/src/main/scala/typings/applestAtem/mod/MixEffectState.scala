package typings.applestAtem.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the current state of a Mix Effect */
trait MixEffectState extends StObject {
  
  /** whether FTB is currently active */
  var fadeToBlack: js.UndefOr[Boolean] = js.undefined
  
  /** the number of USKs */
  var numberOfKeyers: Double
  
  /** the current input being sent to the preview bus */
  var previewInput: VisionChannelNumber
  
  /** the current input being sent to the pgram bus */
  var programInput: VisionChannelNumber
  
  /** the current transition speed, in frames */
  var transitionFrameCount: Double
  
  /** current position of the T-bar */
  var transitionPosition: Double
  
  /** whether PREV TRANS is active */
  var transitionPreview: Boolean
  
  /** the currently selected transition style */
  var transitionStyle: TransitionStyle
  
  /** whether the next transition will fade the BKGD */
  var upstreamKeyNextBackground: Boolean
  
  /** whether the next transition will fade the USKs */
  var upstreamKeyNextState: NumberDictionary[Boolean]
  
  /** the current state (active/inactive) of each USK */
  var upstreamKeyState: NumberDictionary[Boolean]
}
object MixEffectState {
  
  inline def apply(
    numberOfKeyers: Double,
    previewInput: VisionChannelNumber,
    programInput: VisionChannelNumber,
    transitionFrameCount: Double,
    transitionPosition: Double,
    transitionPreview: Boolean,
    transitionStyle: TransitionStyle,
    upstreamKeyNextBackground: Boolean,
    upstreamKeyNextState: NumberDictionary[Boolean],
    upstreamKeyState: NumberDictionary[Boolean]
  ): MixEffectState = {
    val __obj = js.Dynamic.literal(numberOfKeyers = numberOfKeyers.asInstanceOf[js.Any], previewInput = previewInput.asInstanceOf[js.Any], programInput = programInput.asInstanceOf[js.Any], transitionFrameCount = transitionFrameCount.asInstanceOf[js.Any], transitionPosition = transitionPosition.asInstanceOf[js.Any], transitionPreview = transitionPreview.asInstanceOf[js.Any], transitionStyle = transitionStyle.asInstanceOf[js.Any], upstreamKeyNextBackground = upstreamKeyNextBackground.asInstanceOf[js.Any], upstreamKeyNextState = upstreamKeyNextState.asInstanceOf[js.Any], upstreamKeyState = upstreamKeyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixEffectState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixEffectState] (val x: Self) extends AnyVal {
    
    inline def setFadeToBlack(value: Boolean): Self = StObject.set(x, "fadeToBlack", value.asInstanceOf[js.Any])
    
    inline def setFadeToBlackUndefined: Self = StObject.set(x, "fadeToBlack", js.undefined)
    
    inline def setNumberOfKeyers(value: Double): Self = StObject.set(x, "numberOfKeyers", value.asInstanceOf[js.Any])
    
    inline def setPreviewInput(value: VisionChannelNumber): Self = StObject.set(x, "previewInput", value.asInstanceOf[js.Any])
    
    inline def setProgramInput(value: VisionChannelNumber): Self = StObject.set(x, "programInput", value.asInstanceOf[js.Any])
    
    inline def setTransitionFrameCount(value: Double): Self = StObject.set(x, "transitionFrameCount", value.asInstanceOf[js.Any])
    
    inline def setTransitionPosition(value: Double): Self = StObject.set(x, "transitionPosition", value.asInstanceOf[js.Any])
    
    inline def setTransitionPreview(value: Boolean): Self = StObject.set(x, "transitionPreview", value.asInstanceOf[js.Any])
    
    inline def setTransitionStyle(value: TransitionStyle): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
    
    inline def setUpstreamKeyNextBackground(value: Boolean): Self = StObject.set(x, "upstreamKeyNextBackground", value.asInstanceOf[js.Any])
    
    inline def setUpstreamKeyNextState(value: NumberDictionary[Boolean]): Self = StObject.set(x, "upstreamKeyNextState", value.asInstanceOf[js.Any])
    
    inline def setUpstreamKeyState(value: NumberDictionary[Boolean]): Self = StObject.set(x, "upstreamKeyState", value.asInstanceOf[js.Any])
  }
}
