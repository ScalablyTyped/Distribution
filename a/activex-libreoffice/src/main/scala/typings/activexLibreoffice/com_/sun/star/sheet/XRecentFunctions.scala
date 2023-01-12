package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a list of recently used functions.
  * @see com.sun.star.sheet.RecentFunctions
  */
trait XRecentFunctions
  extends StObject
     with XInterface {
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  val MaxRecentFunctions: Double
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  var RecentFunctionIds: SafeArray[Double]
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): Double
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): SafeArray[Double]
  
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: SeqEquiv[Double]): Unit
}
object XRecentFunctions {
  
  inline def apply(
    MaxRecentFunctions: Double,
    RecentFunctionIds: SafeArray[Double],
    acquire: () => Unit,
    getMaxRecentFunctions: () => Double,
    getRecentFunctionIds: () => SafeArray[Double],
    queryInterface: `type` => Any,
    release: () => Unit,
    setRecentFunctionIds: SeqEquiv[Double] => Unit
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal(MaxRecentFunctions = MaxRecentFunctions.asInstanceOf[js.Any], RecentFunctionIds = RecentFunctionIds.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMaxRecentFunctions = js.Any.fromFunction0(getMaxRecentFunctions), getRecentFunctionIds = js.Any.fromFunction0(getRecentFunctionIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRecentFunctionIds = js.Any.fromFunction1(setRecentFunctionIds))
    __obj.asInstanceOf[XRecentFunctions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRecentFunctions] (val x: Self) extends AnyVal {
    
    inline def setGetMaxRecentFunctions(value: () => Double): Self = StObject.set(x, "getMaxRecentFunctions", js.Any.fromFunction0(value))
    
    inline def setGetRecentFunctionIds(value: () => SafeArray[Double]): Self = StObject.set(x, "getRecentFunctionIds", js.Any.fromFunction0(value))
    
    inline def setMaxRecentFunctions(value: Double): Self = StObject.set(x, "MaxRecentFunctions", value.asInstanceOf[js.Any])
    
    inline def setRecentFunctionIds(value: SafeArray[Double]): Self = StObject.set(x, "RecentFunctionIds", value.asInstanceOf[js.Any])
    
    inline def setSetRecentFunctionIds(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "setRecentFunctionIds", js.Any.fromFunction1(value))
  }
}
