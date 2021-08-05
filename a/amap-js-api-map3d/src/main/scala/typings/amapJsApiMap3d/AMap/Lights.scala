package typings.amapJsApiMap3d.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lights {
  
  trait AmbientLight extends StObject {
    
    def setColor(color: js.Tuple3[Double, Double, Double]): Unit
    
    def setIntensity(intensity: Double): Unit
  }
  object AmbientLight {
    
    inline def apply(setColor: js.Tuple3[Double, Double, Double] => Unit, setIntensity: Double => Unit): AmbientLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity))
      __obj.asInstanceOf[AmbientLight]
    }
    
    extension [Self <: AmbientLight](x: Self) {
      
      inline def setSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
      
      inline def setSetIntensity(value: Double => Unit): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1(value))
    }
  }
  
  trait DirectionLight extends StObject {
    
    def setColor(direction: js.Tuple3[Double, Double, Double]): Unit
    
    def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit
    
    def setIntensity(intensity: Double): Unit
    
    def update(): Unit
  }
  object DirectionLight {
    
    inline def apply(
      setColor: js.Tuple3[Double, Double, Double] => Unit,
      setDirection: js.Tuple3[Double, Double, Double] => Unit,
      setIntensity: Double => Unit,
      update: () => Unit
    ): DirectionLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setDirection = js.Any.fromFunction1(setDirection), setIntensity = js.Any.fromFunction1(setIntensity), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[DirectionLight]
    }
    
    extension [Self <: DirectionLight](x: Self) {
      
      inline def setSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
      
      inline def setSetDirection(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetIntensity(value: Double => Unit): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
