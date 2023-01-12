package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValue extends StObject {
  
  /**
    * If the comparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
    */
  var cidrs: js.UndefOr[Cidrs] = js.undefined
  
  /**
    * If the comparisonOperator calls for a numeric value, use this to specify that numeric value to be compared with the metric.
    */
  var count: js.UndefOr[UnsignedLong] = js.undefined
  
  /**
    *  The numeral value of a metric. 
    */
  var number: js.UndefOr[Number] = js.undefined
  
  /**
    *  The numeral values of a metric. 
    */
  var numbers: js.UndefOr[NumberList] = js.undefined
  
  /**
    * If the comparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
    */
  var ports: js.UndefOr[Ports] = js.undefined
  
  /**
    *  The string values of a metric. 
    */
  var strings: js.UndefOr[StringList] = js.undefined
}
object MetricValue {
  
  inline def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricValue] (val x: Self) extends AnyVal {
    
    inline def setCidrs(value: Cidrs): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: Cidr*): Self = StObject.set(x, "cidrs", js.Array(value*))
    
    inline def setCount(value: UnsignedLong): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setNumber(value: Number): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setNumbers(value: NumberList): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
    
    inline def setNumbersVarargs(value: Number*): Self = StObject.set(x, "numbers", js.Array(value*))
    
    inline def setPorts(value: Ports): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Port*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setStrings(value: StringList): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStringsVarargs(value: stringValue*): Self = StObject.set(x, "strings", js.Array(value*))
  }
}
