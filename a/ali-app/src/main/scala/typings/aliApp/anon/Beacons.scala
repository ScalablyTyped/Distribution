package typings.aliApp.anon

import typings.aliApp.my.Beacon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beacons extends StObject {
  
  var beacons: js.Array[Beacon]
}
object Beacons {
  
  inline def apply(beacons: js.Array[Beacon]): Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacons]
  }
  
  extension [Self <: Beacons](x: Self) {
    
    inline def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    inline def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value*))
  }
}
