package typings.athenajs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.athenajs.athenajsBooleans.`false`
import typings.athenajs.athenajsNumbers.`10`
import typings.athenajs.athenajsNumbers.`11`
import typings.athenajs.athenajsNumbers.`12`
import typings.athenajs.athenajsNumbers.`13`
import typings.athenajs.athenajsNumbers.`14`
import typings.athenajs.athenajsNumbers.`15`
import typings.athenajs.athenajsNumbers.`17`
import typings.athenajs.athenajsNumbers.`1`
import typings.athenajs.athenajsNumbers.`27`
import typings.athenajs.athenajsNumbers.`2`
import typings.athenajs.athenajsNumbers.`37`
import typings.athenajs.athenajsNumbers.`38`
import typings.athenajs.athenajsNumbers.`39`
import typings.athenajs.athenajsNumbers.`3`
import typings.athenajs.athenajsNumbers.`40`
import typings.athenajs.athenajsNumbers.`4`
import typings.athenajs.athenajsNumbers.`5`
import typings.athenajs.athenajsNumbers.`6`
import typings.athenajs.athenajsNumbers.`7`
import typings.athenajs.athenajsNumbers.`8`
import typings.athenajs.athenajsNumbers.`9`
import typings.athenajs.mod.Behavior
import typings.athenajs.mod.Display
import typings.athenajs.mod.Drawable
import typings.athenajs.mod.Effect
import typings.athenajs.mod.EffectOptions
import typings.athenajs.mod.JSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`
    extends StObject
       with Instantiable0[Effect]
  
  trait `32` extends StObject {
    
    var `32`: `1`
    
    var `37`: `14`
    
    var `38`: `12`
    
    var `39`: `15`
    
    // Directional (discrete) pad
    var `40`: `13`
    
    // Face (main) buttons
    var FACE_0: `1`
    
    var FACE_3: `2`
    
    var FACE_4: `3`
    
    var LEFT_ANALOGUE_STICK: `10`
    
    var LEFT_SHOULDER: `4`
    
    var LEFT_SHOULDER_BOTTOM: `6`
    
    // Analogue sticks (if depressible)
    var RIGHT_ANALOGUE_STICK: `11`
    
    // Top shoulder buttons
    var RIGHT_SHOULDER: `5`
    
    // Bottom shoulder buttons
    var RIGHT_SHOULDER_BOTTOM: `7`
    
    var SELECT: `8`
    
    var START: `9`
  }
  object `32` {
    
    @scala.inline
    def apply(): `32` = {
      val __obj = js.Dynamic.literal(FACE_0 = 1, FACE_3 = 2, FACE_4 = 3, LEFT_ANALOGUE_STICK = 10, LEFT_SHOULDER = 4, LEFT_SHOULDER_BOTTOM = 6, RIGHT_ANALOGUE_STICK = 11, RIGHT_SHOULDER = 5, RIGHT_SHOULDER_BOTTOM = 7, SELECT = 8, START = 9)
      __obj.updateDynamic("32")(1)
      __obj.updateDynamic("37")(14)
      __obj.updateDynamic("38")(12)
      __obj.updateDynamic("39")(15)
      __obj.updateDynamic("40")(13)
      __obj.asInstanceOf[`32`]
    }
    
    @scala.inline
    implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set32(value: `1`): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set37(value: `14`): Self = StObject.set(x, "37", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set38(value: `12`): Self = StObject.set(x, "38", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set39(value: `15`): Self = StObject.set(x, "39", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set40(value: `13`): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFACE_0(value: `1`): Self = StObject.set(x, "FACE_0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFACE_3(value: `2`): Self = StObject.set(x, "FACE_3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFACE_4(value: `3`): Self = StObject.set(x, "FACE_4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEFT_ANALOGUE_STICK(value: `10`): Self = StObject.set(x, "LEFT_ANALOGUE_STICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEFT_SHOULDER(value: `4`): Self = StObject.set(x, "LEFT_SHOULDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEFT_SHOULDER_BOTTOM(value: `6`): Self = StObject.set(x, "LEFT_SHOULDER_BOTTOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIGHT_ANALOGUE_STICK(value: `11`): Self = StObject.set(x, "RIGHT_ANALOGUE_STICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIGHT_SHOULDER(value: `5`): Self = StObject.set(x, "RIGHT_SHOULDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIGHT_SHOULDER_BOTTOM(value: `7`): Self = StObject.set(x, "RIGHT_SHOULDER_BOTTOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSELECT(value: `8`): Self = StObject.set(x, "SELECT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTART(value: `9`): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    }
  }
  
  trait AIR extends StObject {
    
    var AIR: `1`
    
    var LADDER: `3`
    
    var WALL: `2`
  }
  object AIR {
    
    @scala.inline
    def apply(): AIR = {
      val __obj = js.Dynamic.literal(AIR = 1, LADDER = 3, WALL = 2)
      __obj.asInstanceOf[AIR]
    }
    
    @scala.inline
    implicit class AIRMutableBuilder[Self <: AIR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAIR(value: `1`): Self = StObject.set(x, "AIR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLADDER(value: `3`): Self = StObject.set(x, "LADDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWALL(value: `2`): Self = StObject.set(x, "WALL", value.asInstanceOf[js.Any])
    }
  }
  
  trait CTRL extends StObject {
    
    var CTRL: `17`
    
    var DOWN: `40`
    
    var ENTER: `13`
    
    var ESCAPE: `27`
    
    var LEFT: `37`
    
    var RIGHT: `39`
    
    var SPACE: typings.athenajs.athenajsNumbers.`32`
    
    var UP: `38`
  }
  object CTRL {
    
    @scala.inline
    def apply(): CTRL = {
      val __obj = js.Dynamic.literal(CTRL = 17, DOWN = 40, ENTER = 13, ESCAPE = 27, LEFT = 37, RIGHT = 39, SPACE = 32, UP = 38)
      __obj.asInstanceOf[CTRL]
    }
    
    @scala.inline
    implicit class CTRLMutableBuilder[Self <: CTRL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCTRL(value: `17`): Self = StObject.set(x, "CTRL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOWN(value: `40`): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENTER(value: `13`): Self = StObject.set(x, "ENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setESCAPE(value: `27`): Self = StObject.set(x, "ESCAPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEFT(value: `37`): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIGHT(value: `39`): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPACE(value: typings.athenajs.athenajsNumbers.`32`): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUP(value: `38`): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var hitBox: js.UndefOr[X] = js.undefined
    
    var offsetX: Double
    
    var offsetY: Double
    
    var plane: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, offsetX: Double, offsetY: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitBox(value: X): Self = StObject.set(x, "hitBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitBoxUndefined: Self = StObject.set(x, "hitBox", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlane(value: Double): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaneUndefined: Self = StObject.set(x, "plane", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* sprite */ Drawable, Behavior]
       with Instantiable2[/* sprite */ Drawable, /* options */ JSObject, Behavior]
  
  @js.native
  trait InstantiableEffect
    extends StObject
       with Instantiable2[/* options */ EffectOptions, /* display */ Display, Effect]
  
  trait Loop extends StObject {
    
    var loop: js.UndefOr[`false`] = js.undefined
    
    var pan: js.UndefOr[Boolean] = js.undefined
  }
  object Loop {
    
    @scala.inline
    def apply(): Loop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Loop]
    }
    
    @scala.inline
    implicit class LoopMutableBuilder[Self <: Loop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoop(value: `false`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var x2: Double
    
    var y: Double
    
    var y2: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, x2: Double, y: Double, y2: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
