package typings.amapJsApiIndoorMap

import typings.amapJsApiIndoorMap.AMap.IndoorMap.ShopCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiIndoorMapStrings {
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait complete extends StObject
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait connection
    extends StObject
       with ShopCategory
  inline def connection: connection = "connection".asInstanceOf[connection]
  
  @js.native
  sealed trait floor_complete extends StObject
  inline def floor_complete: floor_complete = "floor_complete".asInstanceOf[floor_complete]
  
  @js.native
  sealed trait mouseout extends StObject
  inline def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover extends StObject
  inline def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait public
    extends StObject
       with ShopCategory
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait shop
    extends StObject
       with ShopCategory
  inline def shop: shop = "shop".asInstanceOf[shop]
}
