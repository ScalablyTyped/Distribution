package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Accurate
import typings.arcgisJsApi.arcgisJsApiStrings.Bevelled
import typings.arcgisJsApi.arcgisJsApiStrings.Block
import typings.arcgisJsApi.arcgisJsApiStrings.Crossed
import typings.arcgisJsApi.arcgisJsApiStrings.Custom
import typings.arcgisJsApi.arcgisJsApiStrings.Fast
import typings.arcgisJsApi.arcgisJsApiStrings.FullGap
import typings.arcgisJsApi.arcgisJsApiStrings.FullPattern
import typings.arcgisJsApi.arcgisJsApiStrings.HalfGap
import typings.arcgisJsApi.arcgisJsApiStrings.HalfPattern
import typings.arcgisJsApi.arcgisJsApiStrings.Mitered
import typings.arcgisJsApi.arcgisJsApiStrings.NoConstraint
import typings.arcgisJsApi.arcgisJsApiStrings.OpenEnded
import typings.arcgisJsApi.arcgisJsApiStrings.Random
import typings.arcgisJsApi.arcgisJsApiStrings.Rounded
import typings.arcgisJsApi.arcgisJsApiStrings.Sinus
import typings.arcgisJsApi.arcgisJsApiStrings.Square
import typings.arcgisJsApi.arcgisJsApiStrings.Triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.CIMGeometricEffectArrow
  - typings.arcgisJsApi.esri.CIMGeometricEffectBuffer
  - typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine
  - typings.arcgisJsApi.esri.CIMGeometricEffectCut
  - typings.arcgisJsApi.esri.CIMGeometricEffectDashes
  - typings.arcgisJsApi.esri.CIMGeometricEffectDonut
  - typings.arcgisJsApi.esri.CIMGeometricEffectJog
  - typings.arcgisJsApi.esri.CIMGeometricEffectMove
  - typings.arcgisJsApi.esri.CIMGeometricEffectOffset
  - typings.arcgisJsApi.esri.CIMGeometricEffectRotate
  - typings.arcgisJsApi.esri.CIMGeometricEffectScale
  - typings.arcgisJsApi.esri.CIMGeometricEffectWave
*/
trait CIMGeometricEffect extends StObject
object CIMGeometricEffect {
  
  inline def CIMGeometricEffectArrow(geometricEffectArrowType: OpenEnded | Block | Crossed, width: Double): typings.arcgisJsApi.esri.CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal(geometricEffectArrowType = geometricEffectArrowType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectArrow")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectArrow]
  }
  
  inline def CIMGeometricEffectBuffer(size: Double): typings.arcgisJsApi.esri.CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectBuffer")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectBuffer]
  }
  
  inline def CIMGeometricEffectControlMeasureLine(rule: String): typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectControlMeasureLine")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine]
  }
  
  inline def CIMGeometricEffectCut(): typings.arcgisJsApi.esri.CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectCut")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectCut]
  }
  
  inline def CIMGeometricEffectDashes(
    dashTemplate: js.Array[Double],
    lineDashEnding: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom,
    offsetAlongLine: Double
  ): typings.arcgisJsApi.esri.CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal(dashTemplate = dashTemplate.asInstanceOf[js.Any], lineDashEnding = lineDashEnding.asInstanceOf[js.Any], offsetAlongLine = offsetAlongLine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectDashes")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectDashes]
  }
  
  inline def CIMGeometricEffectDonut(option: Fast | Accurate, width: Double): typings.arcgisJsApi.esri.CIMGeometricEffectDonut = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectDonut")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectDonut]
  }
  
  inline def CIMGeometricEffectJog(angle: Double, length: Double, position: Double): typings.arcgisJsApi.esri.CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectJog")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectJog]
  }
  
  inline def CIMGeometricEffectMove(): typings.arcgisJsApi.esri.CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectMove")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectMove]
  }
  
  inline def CIMGeometricEffectOffset(method: Mitered | Bevelled | Rounded | Square, offset: Double, option: Fast | Accurate): typings.arcgisJsApi.esri.CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectOffset")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectOffset]
  }
  
  inline def CIMGeometricEffectRotate(angle: Double): typings.arcgisJsApi.esri.CIMGeometricEffectRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectRotate")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectRotate]
  }
  
  inline def CIMGeometricEffectScale(XScaleFactor: Double, YScaleFactor: Double): typings.arcgisJsApi.esri.CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal(XScaleFactor = XScaleFactor.asInstanceOf[js.Any], YScaleFactor = YScaleFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectScale")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectScale]
  }
  
  inline def CIMGeometricEffectWave(amplitude: Double, period: Double, waveform: Sinus | Square | Triangle | Random): typings.arcgisJsApi.esri.CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectWave")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectWave]
  }
}
