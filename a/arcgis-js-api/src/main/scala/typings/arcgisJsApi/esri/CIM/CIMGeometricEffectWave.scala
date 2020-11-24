package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectWave
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance perpendicular to a feature to display the curves for the symbol.
    */
  var amplitude: js.UndefOr[Double] = js.native
  
  /**
    * The distance along the line or polygon to display the curves for the symbol.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * The staring value for generating a random number. This is only used when the Waveform is set to Random.
    */
  var seed: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectWave: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave = js.native
  
  /**
    * The shape of the curves to be displayed along the symbol.
    */
  var waveform: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectWaveform * / any */ String
  ] = js.native
}
object CIMGeometricEffectWave {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave): CIMGeometricEffectWave = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectWave]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectWaveOps[Self <: CIMGeometricEffectWave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectWave): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitude(value: Double): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("amplitude", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setWaveform(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectWaveform * / any */ String
    ): Self = this.set("waveform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaveform: Self = this.set("waveform", js.undefined)
  }
}
