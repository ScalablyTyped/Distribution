package typings.androiduix.goog.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long extends js.Object {
  
  def add(other: Long): Long = js.native
  
  def and(other: Long): Long = js.native
  
  def compare(other: Long): Double = js.native
  
  def div(other: Long): Long = js.native
  
  def equals(other: Long): Boolean = js.native
  
  def getHighBits(): Double = js.native
  
  def getLowBits(): Double = js.native
  
  def getLowBitsUnsigned(): Double = js.native
  
  def getNumBitsAbs(): Double = js.native
  
  def greaterThan(other: Long): Boolean = js.native
  
  def greaterThanOrEqual(other: Long): Boolean = js.native
  
  var high_ : js.Any = js.native
  
  def isNegative(): Boolean = js.native
  
  def isOdd(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def lessThan(other: Long): Boolean = js.native
  
  def lessThanOrEqual(other: Long): Boolean = js.native
  
  var low_ : js.Any = js.native
  
  def modulo(other: Long): Long = js.native
  
  def multiply(other: Long): Long = js.native
  
  def negate(): Long = js.native
  
  def not(): Long = js.native
  
  def notEquals(other: Long): Boolean = js.native
  
  def or(other: Long): Long = js.native
  
  def shiftLeft(numBits: Double): Long = js.native
  
  def shiftRight(numBits: Double): Long = js.native
  
  def shiftRightUnsigned(numBits: Double): Long = js.native
  
  def subtract(other: Long): Long = js.native
  
  def toInt(): Double = js.native
  
  def toNumber(): Double = js.native
  
  def toString(opt_radix: Double): String = js.native
  
  def xor(other: Long): Long = js.native
}
object Long {
  
  @scala.inline
  def apply(
    add: Long => Long,
    and: Long => Long,
    compare: Long => Double,
    div: Long => Long,
    equals: Long => Boolean,
    getHighBits: () => Double,
    getLowBits: () => Double,
    getLowBitsUnsigned: () => Double,
    getNumBitsAbs: () => Double,
    greaterThan: Long => Boolean,
    greaterThanOrEqual: Long => Boolean,
    high_ : js.Any,
    isNegative: () => Boolean,
    isOdd: () => Boolean,
    isZero: () => Boolean,
    lessThan: Long => Boolean,
    lessThanOrEqual: Long => Boolean,
    low_ : js.Any,
    modulo: Long => Long,
    multiply: Long => Long,
    negate: () => Long,
    not: () => Long,
    notEquals: Long => Boolean,
    or: Long => Long,
    shiftLeft: Double => Long,
    shiftRight: Double => Long,
    shiftRightUnsigned: Double => Long,
    subtract: Long => Long,
    toInt: () => Double,
    toNumber: () => Double,
    toString: Double => String,
    xor: Long => Long
  ): Long = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), and = js.Any.fromFunction1(and), compare = js.Any.fromFunction1(compare), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), getHighBits = js.Any.fromFunction0(getHighBits), getLowBits = js.Any.fromFunction0(getLowBits), getLowBitsUnsigned = js.Any.fromFunction0(getLowBitsUnsigned), getNumBitsAbs = js.Any.fromFunction0(getNumBitsAbs), greaterThan = js.Any.fromFunction1(greaterThan), greaterThanOrEqual = js.Any.fromFunction1(greaterThanOrEqual), high_ = high_.asInstanceOf[js.Any], isNegative = js.Any.fromFunction0(isNegative), isOdd = js.Any.fromFunction0(isOdd), isZero = js.Any.fromFunction0(isZero), lessThan = js.Any.fromFunction1(lessThan), lessThanOrEqual = js.Any.fromFunction1(lessThanOrEqual), low_ = low_.asInstanceOf[js.Any], modulo = js.Any.fromFunction1(modulo), multiply = js.Any.fromFunction1(multiply), negate = js.Any.fromFunction0(negate), not = js.Any.fromFunction0(not), notEquals = js.Any.fromFunction1(notEquals), or = js.Any.fromFunction1(or), shiftLeft = js.Any.fromFunction1(shiftLeft), shiftRight = js.Any.fromFunction1(shiftRight), shiftRightUnsigned = js.Any.fromFunction1(shiftRightUnsigned), subtract = js.Any.fromFunction1(subtract), toInt = js.Any.fromFunction0(toInt), toNumber = js.Any.fromFunction0(toNumber), toString = js.Any.fromFunction1(toString), xor = js.Any.fromFunction1(xor))
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Long => Long): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnd(value: Long => Long): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompare(value: Long => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiv(value: Long => Long): Self = this.set("div", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Long => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHighBits(value: () => Double): Self = this.set("getHighBits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowBits(value: () => Double): Self = this.set("getLowBits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowBitsUnsigned(value: () => Double): Self = this.set("getLowBitsUnsigned", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumBitsAbs(value: () => Double): Self = this.set("getNumBitsAbs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGreaterThan(value: Long => Boolean): Self = this.set("greaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGreaterThanOrEqual(value: Long => Boolean): Self = this.set("greaterThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHigh_(value: js.Any): Self = this.set("high_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNegative(value: () => Boolean): Self = this.set("isNegative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOdd(value: () => Boolean): Self = this.set("isOdd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsZero(value: () => Boolean): Self = this.set("isZero", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLessThan(value: Long => Boolean): Self = this.set("lessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessThanOrEqual(value: Long => Boolean): Self = this.set("lessThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLow_(value: js.Any): Self = this.set("low_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulo(value: Long => Long): Self = this.set("modulo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply(value: Long => Long): Self = this.set("multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNegate(value: () => Long): Self = this.set("negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNot(value: () => Long): Self = this.set("not", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotEquals(value: Long => Boolean): Self = this.set("notEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOr(value: Long => Long): Self = this.set("or", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShiftLeft(value: Double => Long): Self = this.set("shiftLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShiftRight(value: Double => Long): Self = this.set("shiftRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShiftRightUnsigned(value: Double => Long): Self = this.set("shiftRightUnsigned", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtract(value: Long => Long): Self = this.set("subtract", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToInt(value: () => Double): Self = this.set("toInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToNumber(value: () => Double): Self = this.set("toNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString(value: Double => String): Self = this.set("toString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXor(value: Long => Long): Self = this.set("xor", js.Any.fromFunction1(value))
  }
}
