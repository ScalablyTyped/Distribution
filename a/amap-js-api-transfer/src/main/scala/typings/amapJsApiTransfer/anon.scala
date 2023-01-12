package typings.amapJsApiTransfer

import typings.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destination extends StObject {
    
    /**
      * 终点坐标
      */
    var destination: LocationValue
    
    /**
      * 终点名称
      */
    var destinationName: js.UndefOr[String] = js.undefined
    
    /**
      * 起点坐标
      */
    var origin: LocationValue
    
    /**
      * 起点名称
      */
    var originName: js.UndefOr[String] = js.undefined
  }
  object Destination {
    
    inline def apply(destination: LocationValue, origin: LocationValue): Destination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: LocationValue): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
      
      inline def setOrigin(value: LocationValue): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
      
      inline def setOriginNameUndefined: Self = StObject.set(x, "originName", js.undefined)
    }
  }
  
  trait Info extends StObject {
    
    var info: String
  }
  object Info {
    
    inline def apply(info: String): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
}
