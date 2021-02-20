package typings.amapJsApiDriving

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiDriving.amapJsApiDrivingStrings.end
import typings.amapJsApiDriving.amapJsApiDrivingStrings.start
import typings.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Destination extends StObject {
    
    var destination: LocationValue = js.native
    
    var destinationName: js.UndefOr[String] = js.native
    
    var origin: LocationValue = js.native
    
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
  
  @js.native
  trait IsWaypoint extends StObject {
    
    var isWaypoint: Boolean = js.native
  }
  object IsWaypoint {
    
    @scala.inline
    def apply(isWaypoint: Boolean): IsWaypoint = {
      val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsWaypoint]
    }
    
    @scala.inline
    implicit class IsWaypointMutableBuilder[Self <: IsWaypoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined amap-js-api-driving.AMap.Driving.Poi & {  isWaypoint :boolean} */
  @js.native
  trait PoiisWaypointboolean extends StObject {
    
    var isWaypoint: Boolean = js.native
    
    var location: LngLat = js.native
    
    var name: String = js.native
    
    var `type`: start | end | waypoint = js.native
  }
  object PoiisWaypointboolean {
    
    @scala.inline
    def apply(isWaypoint: Boolean, location: LngLat, name: String, `type`: start | end | waypoint): PoiisWaypointboolean = {
      val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiisWaypointboolean]
    }
    
    @scala.inline
    implicit class PoiisWaypointbooleanMutableBuilder[Self <: PoiisWaypointboolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: start | end | waypoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
