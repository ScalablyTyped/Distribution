package typings.amapJsApiDistrictSearch

import typings.amapJsApiDistrictSearch.AMap.DistrictSearch.Level
import typings.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiDistrictSearchStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @scala.inline
  def biz_area: biz_area = "biz_area".asInstanceOf[biz_area]
  
  @scala.inline
  def city: city = "city".asInstanceOf[city]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  
  @scala.inline
  def district: district = "district".asInstanceOf[district]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @scala.inline
  def province: province = "province".asInstanceOf[province]
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait biz_area extends Level
  
  @js.native
  sealed trait city extends Level
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait country extends Level
  
  @js.native
  sealed trait district extends Level
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait province extends Level
}
