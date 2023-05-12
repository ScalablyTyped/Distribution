package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsBandIndexType extends StObject {
  
  /**
    * The Burn Area Index (BAI) uses the reflectance values in the red and NIR portion of the spectrum to identify the areas of the terrain affected by fire.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var BAI: Double
  
  /**
    * Chlorophyll index - Green (CIG) method is a vegetation index for estimating the chlorophyll content in leaves using the ratio of reflectivity in the NIR and green bands.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var CIG: Double
  
  /**
    * The Chlorophyll Index - Red-Edge (CIre) method is a vegetation index for estimating the chlorophyll content in leaves using the ratio of reflectivity in the NIR and red-edge bands.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var CIRe: Double
  
  /**
    * The Enhanced Vegetation Index (EVI) method is an optimized vegetation index that accounts for atmospheric influences and vegetation background signal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var EVI: Double
  
  /**
    * The Global Environmental Monitoring Index (GEMI) method is a nonlinear vegetation index for global environmental monitoring from satellite imagery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var GEMI: Double
  
  /**
    * The Green Normalized Difference Vegetation Index (GNDVI) method is a vegetation index for estimating photo synthetic activity and is a commonly used vegetation index to determine water and nitrogen uptake into the plant canopy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var GNDVI: Double
  
  /**
    * The Green Vegetation Index (GVI) method was originally designed from Landsat MSS imagery and has been modified for Landsat TM imagery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var GVITM: Double
  
  /**
    * The Modified Normalized Difference Water Index (MNDWI) uses green and SWIR bands for the enhancement of open water features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var MNDWI: Double
  
  /**
    * The Modified Soil Adjusted Vegetation Index (MSAVI) method minimizes the effect of bare soil on the SAVI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var MSAVI: Double
  
  /**
    * The Modified Triangular Vegetation Index (MTVI2) method is a vegetation index for detecting leaf chlorophyll content at the canopy scale while being relatively insensitive to leaf area index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var MTVI2: Double
  
  /**
    * The Normalized Burn Ratio Index (NBRI) uses the NIR and SWIR bands to emphasize burned areas, while mitigating illumination and atmospheric effects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NBR: Double
  
  /**
    * The Normalized Difference Built-up Index (NDBI) uses the NIR and SWIR bands to emphasize manufactured built-up areas.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDBI: Double
  
  /**
    * The Normalized Difference Moisture Index (NDMI) is sensitive to the moisture levels in vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDMI: Double
  
  /**
    * The Normalized Difference Snow Index (NDSI) is designed to use MODIS (band 4 and band 6) and Landsat TM (band 2 and band 5) for identification of snow cover while ignoring cloud cover.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDSI: Double
  
  /**
    * The Normalized Difference Vegetation Index (NDVI) method is a standardized index allowing you to generate an image displaying greenness (relative biomass).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDVI: Double
  
  /**
    * The Red-Edge NDVI (NDVIre) method is a vegetation index for estimating vegetation health using the red-edge band.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDVIRe: Double
  
  /**
    * The Normalized Difference Water Index (NDWI) method is an index for delineating and monitoring content changes in surface water.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var NDWI: Double
  
  /**
    * The Perpendicular Vegetation Index (PVI) method is similar to a difference vegetation index; however, it is sensitive to atmospheric variations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var PVI: String
  
  /**
    * The Red-Edge Triangulated Vegetation Index (RTVICore) method is a vegetation index for estimating leaf area index and biomass.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var RTVICore: Double
  
  /**
    * The Soil-Adjusted Vegetation Index (SAVI) method is a vegetation index that attempts to minimize soil brightness influences using a soil-brightness correction factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var SAVI: Double
  
  /**
    * The Simple Ratio (SR) method is a common vegetation index for estimating the amount of vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var SR: Double
  
  /**
    * The Red-Edge Simple Ratio (SRre) method is a vegetation index for estimating the amount of healthy and stressed vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var SRRe: Double
  
  /**
    * The Sultan's process takes a six-band 8-bit image and uses the Sultan's Formula method to produce a three-band 8-bit image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var Sultan: Double
  
  /**
    * The Transformed Soil Adjusted Vegetation Index (TSAVI) method is a vegetation index that minimizes soil brightness influences by assuming the soil line has an arbitrary slope and intercept.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var TSAVI: Double
  
  /**
    * The Visible Atmospherically Resistant Index (VARI) method is a vegetation index for estimating vegetation fraction quantitatively with only the visible range of the spectrum.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var VARI: Double
  
  /**
    * The Weighted Normalized Difference Water Index (WNDWI) method is a water index developed to reduce errors typically encountered in other water indices, including water turbidity, small water bodies, or shadow in remote sensing scenes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var WNDWI: Double
  
  /**
    * The Clay Minerals (clayMinerals) ratio method is a geological index for identifying mineral features containing clay and alunite using two shortwave infrared (SWIR) bands.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var clayMinerals: Double
  
  /**
    * The Ferrous Minerals (ferrousMinerals) ratio method is a geological index for identifying rock features containing some quantity of iron-bearing minerals using the SWIR and NIR bands.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var ferrousMinerals: Double
  
  /**
    * The Iron Oxide (ironOxide) ratio method is a geological index for identifying rock features that have experienced oxidation of iron-bearing sulfides using the red and blue bands.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var ironOxide: Double
  
  /**
    * User defined method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#bandIndexType)
    */
  var userDefined: Double
}
object rasterFunctionConstantsBandIndexType {
  
  inline def apply(
    BAI: Double,
    CIG: Double,
    CIRe: Double,
    EVI: Double,
    GEMI: Double,
    GNDVI: Double,
    GVITM: Double,
    MNDWI: Double,
    MSAVI: Double,
    MTVI2: Double,
    NBR: Double,
    NDBI: Double,
    NDMI: Double,
    NDSI: Double,
    NDVI: Double,
    NDVIRe: Double,
    NDWI: Double,
    PVI: String,
    RTVICore: Double,
    SAVI: Double,
    SR: Double,
    SRRe: Double,
    Sultan: Double,
    TSAVI: Double,
    VARI: Double,
    WNDWI: Double,
    clayMinerals: Double,
    ferrousMinerals: Double,
    ironOxide: Double,
    userDefined: Double
  ): rasterFunctionConstantsBandIndexType = {
    val __obj = js.Dynamic.literal(BAI = BAI.asInstanceOf[js.Any], CIG = CIG.asInstanceOf[js.Any], CIRe = CIRe.asInstanceOf[js.Any], EVI = EVI.asInstanceOf[js.Any], GEMI = GEMI.asInstanceOf[js.Any], GNDVI = GNDVI.asInstanceOf[js.Any], GVITM = GVITM.asInstanceOf[js.Any], MNDWI = MNDWI.asInstanceOf[js.Any], MSAVI = MSAVI.asInstanceOf[js.Any], MTVI2 = MTVI2.asInstanceOf[js.Any], NBR = NBR.asInstanceOf[js.Any], NDBI = NDBI.asInstanceOf[js.Any], NDMI = NDMI.asInstanceOf[js.Any], NDSI = NDSI.asInstanceOf[js.Any], NDVI = NDVI.asInstanceOf[js.Any], NDVIRe = NDVIRe.asInstanceOf[js.Any], NDWI = NDWI.asInstanceOf[js.Any], PVI = PVI.asInstanceOf[js.Any], RTVICore = RTVICore.asInstanceOf[js.Any], SAVI = SAVI.asInstanceOf[js.Any], SR = SR.asInstanceOf[js.Any], SRRe = SRRe.asInstanceOf[js.Any], Sultan = Sultan.asInstanceOf[js.Any], TSAVI = TSAVI.asInstanceOf[js.Any], VARI = VARI.asInstanceOf[js.Any], WNDWI = WNDWI.asInstanceOf[js.Any], clayMinerals = clayMinerals.asInstanceOf[js.Any], ferrousMinerals = ferrousMinerals.asInstanceOf[js.Any], ironOxide = ironOxide.asInstanceOf[js.Any], userDefined = userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsBandIndexType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsBandIndexType] (val x: Self) extends AnyVal {
    
    inline def setBAI(value: Double): Self = StObject.set(x, "BAI", value.asInstanceOf[js.Any])
    
    inline def setCIG(value: Double): Self = StObject.set(x, "CIG", value.asInstanceOf[js.Any])
    
    inline def setCIRe(value: Double): Self = StObject.set(x, "CIRe", value.asInstanceOf[js.Any])
    
    inline def setClayMinerals(value: Double): Self = StObject.set(x, "clayMinerals", value.asInstanceOf[js.Any])
    
    inline def setEVI(value: Double): Self = StObject.set(x, "EVI", value.asInstanceOf[js.Any])
    
    inline def setFerrousMinerals(value: Double): Self = StObject.set(x, "ferrousMinerals", value.asInstanceOf[js.Any])
    
    inline def setGEMI(value: Double): Self = StObject.set(x, "GEMI", value.asInstanceOf[js.Any])
    
    inline def setGNDVI(value: Double): Self = StObject.set(x, "GNDVI", value.asInstanceOf[js.Any])
    
    inline def setGVITM(value: Double): Self = StObject.set(x, "GVITM", value.asInstanceOf[js.Any])
    
    inline def setIronOxide(value: Double): Self = StObject.set(x, "ironOxide", value.asInstanceOf[js.Any])
    
    inline def setMNDWI(value: Double): Self = StObject.set(x, "MNDWI", value.asInstanceOf[js.Any])
    
    inline def setMSAVI(value: Double): Self = StObject.set(x, "MSAVI", value.asInstanceOf[js.Any])
    
    inline def setMTVI2(value: Double): Self = StObject.set(x, "MTVI2", value.asInstanceOf[js.Any])
    
    inline def setNBR(value: Double): Self = StObject.set(x, "NBR", value.asInstanceOf[js.Any])
    
    inline def setNDBI(value: Double): Self = StObject.set(x, "NDBI", value.asInstanceOf[js.Any])
    
    inline def setNDMI(value: Double): Self = StObject.set(x, "NDMI", value.asInstanceOf[js.Any])
    
    inline def setNDSI(value: Double): Self = StObject.set(x, "NDSI", value.asInstanceOf[js.Any])
    
    inline def setNDVI(value: Double): Self = StObject.set(x, "NDVI", value.asInstanceOf[js.Any])
    
    inline def setNDVIRe(value: Double): Self = StObject.set(x, "NDVIRe", value.asInstanceOf[js.Any])
    
    inline def setNDWI(value: Double): Self = StObject.set(x, "NDWI", value.asInstanceOf[js.Any])
    
    inline def setPVI(value: String): Self = StObject.set(x, "PVI", value.asInstanceOf[js.Any])
    
    inline def setRTVICore(value: Double): Self = StObject.set(x, "RTVICore", value.asInstanceOf[js.Any])
    
    inline def setSAVI(value: Double): Self = StObject.set(x, "SAVI", value.asInstanceOf[js.Any])
    
    inline def setSR(value: Double): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
    
    inline def setSRRe(value: Double): Self = StObject.set(x, "SRRe", value.asInstanceOf[js.Any])
    
    inline def setSultan(value: Double): Self = StObject.set(x, "Sultan", value.asInstanceOf[js.Any])
    
    inline def setTSAVI(value: Double): Self = StObject.set(x, "TSAVI", value.asInstanceOf[js.Any])
    
    inline def setUserDefined(value: Double): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    inline def setVARI(value: Double): Self = StObject.set(x, "VARI", value.asInstanceOf[js.Any])
    
    inline def setWNDWI(value: Double): Self = StObject.set(x, "WNDWI", value.asInstanceOf[js.Any])
  }
}
