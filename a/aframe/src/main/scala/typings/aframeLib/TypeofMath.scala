package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofMath extends js.Object {
  val DEG2RAD: scala.Double
  val RAD2DEG: scala.Double
  def ceilPowerOfTwo(value: scala.Double): scala.Double
  def clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def degToRad(degrees: scala.Double): scala.Double
  def euclideanModulo(n: scala.Double, m: scala.Double): scala.Double
  def floorPowerOfTwo(value: scala.Double): scala.Double
  def generateUUID(): java.lang.String
  def isPowerOfTwo(value: scala.Double): scala.Boolean
  def lerp(x: scala.Double, y: scala.Double, t: scala.Double): scala.Double
  def mapLinear(x: scala.Double, a1: scala.Double, a2: scala.Double, b1: scala.Double, b2: scala.Double): scala.Double
  def nearestPowerOfTwo(value: scala.Double): scala.Double
  def nextPowerOfTwo(value: scala.Double): scala.Double
  def radToDeg(radians: scala.Double): scala.Double
  def randFloat(low: scala.Double, high: scala.Double): scala.Double
  def randFloatSpread(range: scala.Double): scala.Double
  def randInt(low: scala.Double, high: scala.Double): scala.Double
  def random16(): scala.Double
  def smootherstep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def smoothstep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double
}

object TypeofMath {
  @scala.inline
  def apply(
    DEG2RAD: scala.Double,
    RAD2DEG: scala.Double,
    ceilPowerOfTwo: scala.Double => scala.Double,
    clamp: (scala.Double, scala.Double, scala.Double) => scala.Double,
    degToRad: scala.Double => scala.Double,
    euclideanModulo: (scala.Double, scala.Double) => scala.Double,
    floorPowerOfTwo: scala.Double => scala.Double,
    generateUUID: () => java.lang.String,
    isPowerOfTwo: scala.Double => scala.Boolean,
    lerp: (scala.Double, scala.Double, scala.Double) => scala.Double,
    mapLinear: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    nearestPowerOfTwo: scala.Double => scala.Double,
    nextPowerOfTwo: scala.Double => scala.Double,
    radToDeg: scala.Double => scala.Double,
    randFloat: (scala.Double, scala.Double) => scala.Double,
    randFloatSpread: scala.Double => scala.Double,
    randInt: (scala.Double, scala.Double) => scala.Double,
    random16: () => scala.Double,
    smootherstep: (scala.Double, scala.Double, scala.Double) => scala.Double,
    smoothstep: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): TypeofMath = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD, RAD2DEG = RAD2DEG, ceilPowerOfTwo = js.Any.fromFunction1(ceilPowerOfTwo), clamp = js.Any.fromFunction3(clamp), degToRad = js.Any.fromFunction1(degToRad), euclideanModulo = js.Any.fromFunction2(euclideanModulo), floorPowerOfTwo = js.Any.fromFunction1(floorPowerOfTwo), generateUUID = js.Any.fromFunction0(generateUUID), isPowerOfTwo = js.Any.fromFunction1(isPowerOfTwo), lerp = js.Any.fromFunction3(lerp), mapLinear = js.Any.fromFunction5(mapLinear), nearestPowerOfTwo = js.Any.fromFunction1(nearestPowerOfTwo), nextPowerOfTwo = js.Any.fromFunction1(nextPowerOfTwo), radToDeg = js.Any.fromFunction1(radToDeg), randFloat = js.Any.fromFunction2(randFloat), randFloatSpread = js.Any.fromFunction1(randFloatSpread), randInt = js.Any.fromFunction2(randInt), random16 = js.Any.fromFunction0(random16), smootherstep = js.Any.fromFunction3(smootherstep), smoothstep = js.Any.fromFunction3(smoothstep))
  
    __obj.asInstanceOf[TypeofMath]
  }
}

