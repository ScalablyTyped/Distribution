package typings.amapJsApiDistrictSearch

import typings.amapJsApiDistrictSearch.AMap.DistrictSearch.Level
import typings.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiDistrictSearchStrings {
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait biz_area
    extends StObject
       with Level
  inline def biz_area: biz_area = "biz_area".asInstanceOf[biz_area]
  
  @js.native
  sealed trait city
    extends StObject
       with Level
  inline def city: city = "city".asInstanceOf[city]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait country
    extends StObject
       with Level
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait district
    extends StObject
       with Level
  inline def district: district = "district".asInstanceOf[district]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  inline def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait province
    extends StObject
       with Level
  inline def province: province = "province".asInstanceOf[province]
}
