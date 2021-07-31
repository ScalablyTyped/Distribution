package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnMod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iAggFuncServiceMod {
  
  trait IAggFuncService extends StObject {
    
    def addAggFunc(key: String, aggFunc: IAggFunc): Unit
    
    def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit
    
    def clear(): Unit
    
    def getDefaultAggFunc(column: Column): String
  }
  object IAggFuncService {
    
    @scala.inline
    def apply(
      addAggFunc: (String, IAggFunc) => Unit,
      addAggFuncs: StringDictionary[IAggFunc] => Unit,
      clear: () => Unit,
      getDefaultAggFunc: Column => String
    ): IAggFuncService = {
      val __obj = js.Dynamic.literal(addAggFunc = js.Any.fromFunction2(addAggFunc), addAggFuncs = js.Any.fromFunction1(addAggFuncs), clear = js.Any.fromFunction0(clear), getDefaultAggFunc = js.Any.fromFunction1(getDefaultAggFunc))
      __obj.asInstanceOf[IAggFuncService]
    }
    
    @scala.inline
    implicit class IAggFuncServiceMutableBuilder[Self <: IAggFuncService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAggFunc(value: (String, IAggFunc) => Unit): Self = StObject.set(x, "addAggFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddAggFuncs(value: StringDictionary[IAggFunc] => Unit): Self = StObject.set(x, "addAggFuncs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultAggFunc(value: Column => String): Self = StObject.set(x, "getDefaultAggFunc", js.Any.fromFunction1(value))
    }
  }
}
