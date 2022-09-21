package typings.antvPathUtil

import typings.antvPathUtil.antvPathUtilStrings.a_
import typings.antvPathUtil.antvPathUtilStrings.c_
import typings.antvPathUtil.antvPathUtilStrings.h_
import typings.antvPathUtil.antvPathUtilStrings.l_
import typings.antvPathUtil.antvPathUtilStrings.m_
import typings.antvPathUtil.antvPathUtilStrings.o_
import typings.antvPathUtil.antvPathUtilStrings.q_
import typings.antvPathUtil.antvPathUtilStrings.r_
import typings.antvPathUtil.antvPathUtilStrings.s_
import typings.antvPathUtil.antvPathUtilStrings.t_
import typings.antvPathUtil.antvPathUtilStrings.u_
import typings.antvPathUtil.antvPathUtilStrings.v_
import typings.antvPathUtil.antvPathUtilStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type A = js.Tuple8[
    a_ | typings.antvPathUtil.antvPathUtilStrings.A, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  type C = js.Tuple7[
    c_ | typings.antvPathUtil.antvPathUtilStrings.C, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  type H = js.Tuple2[h_ | typings.antvPathUtil.antvPathUtilStrings.H, Double]
  
  type L = js.Tuple3[l_ | typings.antvPathUtil.antvPathUtilStrings.L, Double, Double]
  
  type M = js.Tuple3[m_ | typings.antvPathUtil.antvPathUtilStrings.M, Double, Double]
  
  type O = js.Tuple3[o_ | typings.antvPathUtil.antvPathUtilStrings.O, Double, Double]
  
  type PathCommand = A | C | O | H | L | M | R | Q | S | T | V | U | Z
  
  trait ProcessParams extends StObject {
    
    var qx: Double | Null
    
    var qy: Double | Null
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object ProcessParams {
    
    inline def apply(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): ProcessParams = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], qx = null, qy = null)
      __obj.asInstanceOf[ProcessParams]
    }
    
    extension [Self <: ProcessParams](x: Self) {
      
      inline def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
      
      inline def setQxNull: Self = StObject.set(x, "qx", null)
      
      inline def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
      
      inline def setQyNull: Self = StObject.set(x, "qy", null)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  type Q = js.Tuple5[q_ | typings.antvPathUtil.antvPathUtilStrings.Q, Double, Double, Double, Double]
  
  type R = js.Tuple5[r_ | typings.antvPathUtil.antvPathUtilStrings.R, Double, Double, Double, Double]
  
  type S = js.Tuple8[
    s_ | typings.antvPathUtil.antvPathUtilStrings.S, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  type T = js.Tuple3[t_ | typings.antvPathUtil.antvPathUtilStrings.T, Double, Double]
  
  type U = js.Tuple4[u_ | typings.antvPathUtil.antvPathUtilStrings.U, Double, Double, Double]
  
  type V = js.Tuple2[v_ | typings.antvPathUtil.antvPathUtilStrings.V, Double]
  
  type Z = js.Array[z_ | typings.antvPathUtil.antvPathUtilStrings.Z]
}
