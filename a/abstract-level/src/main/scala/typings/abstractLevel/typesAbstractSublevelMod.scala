package typings.abstractLevel

import typings.abstractLevel.typesAbstractLevelMod.AbstractLevel
import typings.levelTranscoder.libEncodingMod.PartialEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbstractSublevelMod {
  
  /**
    * @template TDatabase Type of parent database.
    * @template TFormat The type used internally by the parent database to store data.
    * @template KDefault The default type of keys if not overridden on operations.
    * @template VDefault The default type of values if not overridden on operations.
    */
  @JSImport("abstract-level/types/abstract-sublevel", "AbstractSublevel")
  @js.native
  open class AbstractSublevel[TDatabase, TFormat, KDefault, VDefault] protected () extends AbstractLevel[TFormat, KDefault, VDefault] {
    /**
      * Sublevel constructor.
      *
      * @param db Parent database.
      * @param name Name of the sublevel, used to prefix keys.
      */
    def this(db: TDatabase, name: String) = this()
    def this(db: TDatabase, name: String, options: AbstractSublevelOptions[KDefault, VDefault]) = this()
    
    /**
      * Parent database. A read-only property.
      */
    def db: TDatabase = js.native
    
    /**
      * Prefix of the sublevel. A read-only string property.
      */
    def prefix: String = js.native
  }
  
  trait AbstractSublevelOptions[K, V] extends StObject {
    
    /**
      * Encoding to use for keys.
      * @defaultValue `'utf8'`
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Character for separating sublevel names from user keys and each other. Must sort
      * before characters used in `name`. An error will be thrown if that's not the case.
      *
      * @defaultValue `'!'`
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding to use for values.
      * @defaultValue `'utf8'`
      */
    var valueEncoding: js.UndefOr[String | (PartialEncoding[V, V])] = js.undefined
  }
  object AbstractSublevelOptions {
    
    inline def apply[K, V](): AbstractSublevelOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractSublevelOptions[K, V]]
    }
    
    extension [Self <: AbstractSublevelOptions[?, ?], K, V](x: Self & (AbstractSublevelOptions[K, V])) {
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setValueEncoding(value: String | (PartialEncoding[V, V])): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
}
