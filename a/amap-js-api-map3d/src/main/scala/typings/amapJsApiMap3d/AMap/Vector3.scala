package typings.amapJsApiMap3d.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector3 extends StObject {
  
  def add(elements: js.Tuple3[Double, Double, Double]): this.type = js.native
  def add(elements: Vector3): this.type = js.native
  
  def addVectors(a: Vector3, b: Vector3): this.type = js.native
  
  def crossVectors(a: Vector3, b: Vector3): this.type = js.native
  
  def dot(): Double = js.native
  
  val elements: js.Tuple3[Double, Double, Double] = js.native
  
  def length(): Double = js.native
  
  def normalize(): this.type = js.native
  
  def set(x: Double, y: Double, z: Double): Unit = js.native
  
  def sub(elements: js.Tuple3[Double, Double, Double]): this.type = js.native
  def sub(elements: Vector3): this.type = js.native
  
  def subVectors(a: Vector3, b: Vector3): this.type = js.native
}
