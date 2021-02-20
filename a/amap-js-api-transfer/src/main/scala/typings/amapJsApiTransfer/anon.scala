package typings.amapJsApiTransfer

import typings.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Destination extends StObject {
    
    /**
      * 终点坐标
      */
    var destination: LocationValue = js.native
    
    /**
      * 终点名称
      */
    var destinationName: js.UndefOr[String] = js.native
    
    /**
      * 起点坐标
      */
    var origin: LocationValue = js.native
    
    /**
      * 起点名称
      */
    var originName: js.UndefOr[String] = js.native
  }
  object Destination {
    
    @scala.inline
    def apply(destination: LocationValue, origin: LocationValue): Destination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    @scala.inline
    implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: LocationValue): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
      
      @scala.inline
      def setOrigin(value: LocationValue): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginNameUndefined: Self = StObject.set(x, "originName", js.undefined)
    }
  }
  
  @js.native
  trait Info extends StObject {
    
    var info: String = js.native
  }
  object Info {
    
    @scala.inline
    def apply(info: String): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
}
