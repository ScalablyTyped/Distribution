package typings.androiduix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object goog {
  
  object math {
    
    @js.native
    trait Long extends StObject {
      
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
        equals_ : Long => Boolean,
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
        toString_ : Double => String,
        xor: Long => Long
      ): Long = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), and = js.Any.fromFunction1(and), compare = js.Any.fromFunction1(compare), div = js.Any.fromFunction1(div), getHighBits = js.Any.fromFunction0(getHighBits), getLowBits = js.Any.fromFunction0(getLowBits), getLowBitsUnsigned = js.Any.fromFunction0(getLowBitsUnsigned), getNumBitsAbs = js.Any.fromFunction0(getNumBitsAbs), greaterThan = js.Any.fromFunction1(greaterThan), greaterThanOrEqual = js.Any.fromFunction1(greaterThanOrEqual), high_ = high_.asInstanceOf[js.Any], isNegative = js.Any.fromFunction0(isNegative), isOdd = js.Any.fromFunction0(isOdd), isZero = js.Any.fromFunction0(isZero), lessThan = js.Any.fromFunction1(lessThan), lessThanOrEqual = js.Any.fromFunction1(lessThanOrEqual), low_ = low_.asInstanceOf[js.Any], modulo = js.Any.fromFunction1(modulo), multiply = js.Any.fromFunction1(multiply), negate = js.Any.fromFunction0(negate), not = js.Any.fromFunction0(not), notEquals = js.Any.fromFunction1(notEquals), or = js.Any.fromFunction1(or), shiftLeft = js.Any.fromFunction1(shiftLeft), shiftRight = js.Any.fromFunction1(shiftRight), shiftRightUnsigned = js.Any.fromFunction1(shiftRightUnsigned), subtract = js.Any.fromFunction1(subtract), toInt = js.Any.fromFunction0(toInt), toNumber = js.Any.fromFunction0(toNumber), xor = js.Any.fromFunction1(xor))
        __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
        __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
        __obj.asInstanceOf[Long]
      }
      
      @scala.inline
      implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(value: Long => Long): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAnd(value: Long => Long): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCompare(value: Long => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDiv(value: Long => Long): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEquals_(value: Long => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetHighBits(value: () => Double): Self = StObject.set(x, "getHighBits", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLowBits(value: () => Double): Self = StObject.set(x, "getLowBits", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLowBitsUnsigned(value: () => Double): Self = StObject.set(x, "getLowBitsUnsigned", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetNumBitsAbs(value: () => Double): Self = StObject.set(x, "getNumBitsAbs", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGreaterThan(value: Long => Boolean): Self = StObject.set(x, "greaterThan", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGreaterThanOrEqual(value: Long => Boolean): Self = StObject.set(x, "greaterThanOrEqual", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHigh_(value: js.Any): Self = StObject.set(x, "high_", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsNegative(value: () => Boolean): Self = StObject.set(x, "isNegative", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsOdd(value: () => Boolean): Self = StObject.set(x, "isOdd", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsZero(value: () => Boolean): Self = StObject.set(x, "isZero", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLessThan(value: Long => Boolean): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLessThanOrEqual(value: Long => Boolean): Self = StObject.set(x, "lessThanOrEqual", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLow_(value: js.Any): Self = StObject.set(x, "low_", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModulo(value: Long => Long): Self = StObject.set(x, "modulo", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMultiply(value: Long => Long): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNegate(value: () => Long): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNot(value: () => Long): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNotEquals(value: Long => Boolean): Self = StObject.set(x, "notEquals", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOr(value: Long => Long): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
        
        @scala.inline
        def setShiftLeft(value: Double => Long): Self = StObject.set(x, "shiftLeft", js.Any.fromFunction1(value))
        
        @scala.inline
        def setShiftRight(value: Double => Long): Self = StObject.set(x, "shiftRight", js.Any.fromFunction1(value))
        
        @scala.inline
        def setShiftRightUnsigned(value: Double => Long): Self = StObject.set(x, "shiftRightUnsigned", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSubtract(value: Long => Long): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToInt(value: () => Double): Self = StObject.set(x, "toInt", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToNumber(value: () => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
        
        @scala.inline
        def setXor(value: Long => Long): Self = StObject.set(x, "xor", js.Any.fromFunction1(value))
      }
    }
  }
}
