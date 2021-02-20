package typings.amapJsApiMap3d.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lights {
  
  @js.native
  trait AmbientLight extends StObject {
    
    def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
    
    def setIntensity(intensity: Double): Unit = js.native
  }
  object AmbientLight {
    
    @scala.inline
    def apply(setColor: js.Tuple3[Double, Double, Double] => Unit, setIntensity: Double => Unit): AmbientLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity))
      __obj.asInstanceOf[AmbientLight]
    }
    
    @scala.inline
    implicit class AmbientLightMutableBuilder[Self <: AmbientLight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIntensity(value: Double => Unit): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DirectionLight extends StObject {
    
    def setColor(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
    
    def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
    
    def setIntensity(intensity: Double): Unit = js.native
    
    def update(): Unit = js.native
  }
  object DirectionLight {
    
    @scala.inline
    def apply(
      setColor: js.Tuple3[Double, Double, Double] => Unit,
      setDirection: js.Tuple3[Double, Double, Double] => Unit,
      setIntensity: Double => Unit,
      update: () => Unit
    ): DirectionLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setDirection = js.Any.fromFunction1(setDirection), setIntensity = js.Any.fromFunction1(setIntensity), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[DirectionLight]
    }
    
    @scala.inline
    implicit class DirectionLightMutableBuilder[Self <: DirectionLight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDirection(value: js.Tuple3[Double, Double, Double] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIntensity(value: Double => Unit): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
