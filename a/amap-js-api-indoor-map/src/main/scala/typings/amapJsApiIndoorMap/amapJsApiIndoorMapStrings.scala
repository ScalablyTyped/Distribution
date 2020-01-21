package typings.amapJsApiIndoorMap

import typings.amapJsApiIndoorMap.AMap.IndoorMap.ShopCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapJsApiIndoorMapStrings {
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait connection extends ShopCategory
  
  @js.native
  sealed trait floor_complete extends js.Object
  
  @js.native
  sealed trait mouseout extends js.Object
  
  @js.native
  sealed trait mouseover extends js.Object
  
  @js.native
  sealed trait public extends ShopCategory
  
  @js.native
  sealed trait shop extends ShopCategory
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def floor_complete: floor_complete = "floor_complete".asInstanceOf[floor_complete]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def shop: shop = "shop".asInstanceOf[shop]
}

