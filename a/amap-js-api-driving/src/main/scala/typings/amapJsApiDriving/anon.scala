package typings.amapJsApiDriving

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiDriving.amapJsApiDrivingStrings.end
import typings.amapJsApiDriving.amapJsApiDrivingStrings.start
import typings.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destination extends StObject {
    
    var destination: LocationValue
    
    var destinationName: js.UndefOr[String] = js.undefined
    
    var origin: LocationValue
    
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
  
  trait IsWaypoint extends StObject {
    
    var isWaypoint: Boolean
  }
  object IsWaypoint {
    
    inline def apply(isWaypoint: Boolean): IsWaypoint = {
      val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsWaypoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsWaypoint] (val x: Self) extends AnyVal {
      
      inline def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined amap-js-api-driving.AMap.Driving.Poi & {  isWaypoint :boolean} */
  trait PoiisWaypointboolean extends StObject {
    
    var isWaypoint: Boolean
    
    var location: LngLat
    
    var name: String
    
    var `type`: start | end | waypoint
  }
  object PoiisWaypointboolean {
    
    inline def apply(isWaypoint: Boolean, location: LngLat, name: String, `type`: start | end | waypoint): PoiisWaypointboolean = {
      val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiisWaypointboolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoiisWaypointboolean] (val x: Self) extends AnyVal {
      
      inline def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: start | end | waypoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
