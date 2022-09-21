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
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.CIMGeometricEffectArrow
  - typings.arcgisJsApi.esri.CIMGeometricEffectBuffer
  - typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine
  - typings.arcgisJsApi.esri.CIMGeometricEffectCut
  - typings.arcgisJsApi.esri.CIMGeometricEffectDashes
  - typings.arcgisJsApi.esri.CIMGeometricEffectJog
  - typings.arcgisJsApi.esri.CIMGeometricEffectMove
  - typings.arcgisJsApi.esri.CIMGeometricEffectOffset
  - typings.arcgisJsApi.esri.CIMGeometricEffectRotate
  - typings.arcgisJsApi.esri.CIMGeometricEffectScale
  - typings.arcgisJsApi.esri.CIMGeometricEffectWave
*/
trait CIMGeometricEffect extends StObject
object CIMGeometricEffect {
  
  inline def CIMGeometricEffectArrow(
    constructor: js.Function,
    geometricEffectArrowType: OpenEnded | Block | Crossed,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): typings.arcgisJsApi.esri.CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometricEffectArrowType = geometricEffectArrowType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectArrow")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectArrow]
  }
  
  inline def CIMGeometricEffectBuffer(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): typings.arcgisJsApi.esri.CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectBuffer")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectBuffer]
  }
  
  inline def CIMGeometricEffectControlMeasureLine(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    rule: String
  ): typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectControlMeasureLine")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectControlMeasureLine]
  }
  
  inline def CIMGeometricEffectCut(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectCut")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectCut]
  }
  
  inline def CIMGeometricEffectDashes(
    constructor: js.Function,
    dashTemplate: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    lineDashEnding: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom,
    offsetAlongLine: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dashTemplate = dashTemplate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lineDashEnding = lineDashEnding.asInstanceOf[js.Any], offsetAlongLine = offsetAlongLine.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectDashes")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectDashes]
  }
  
  inline def CIMGeometricEffectJog(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    length: Double,
    position: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectJog")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectJog]
  }
  
  inline def CIMGeometricEffectMove(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectMove")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectMove]
  }
  
  inline def CIMGeometricEffectOffset(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    method: Mitered | Bevelled | Rounded | Square,
    offset: Double,
    option: Fast | Accurate,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectOffset")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectOffset]
  }
  
  inline def CIMGeometricEffectRotate(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectRotate")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectRotate]
  }
  
  inline def CIMGeometricEffectScale(
    XScaleFactor: Double,
    YScaleFactor: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal(XScaleFactor = XScaleFactor.asInstanceOf[js.Any], YScaleFactor = YScaleFactor.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectScale")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectScale]
  }
  
  inline def CIMGeometricEffectWave(
    amplitude: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    waveform: Sinus | Square | Triangle | Random
  ): typings.arcgisJsApi.esri.CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), waveform = waveform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectWave")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMGeometricEffectWave]
  }
}
