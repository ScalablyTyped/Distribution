package typings.abstractLevel

import typings.abstractLevel.abstractLevelStrings.buffer
import typings.abstractLevel.abstractLevelStrings.utf8
import typings.abstractLevel.abstractLevelStrings.view
import typings.abstractLevel.anon.PartialIManifest
import typings.abstractLevel.typesAbstractIteratorMod.AbstractIteratorOptions
import typings.abstractLevel.typesAbstractIteratorMod.AbstractKeyIteratorOptions
import typings.abstractLevel.typesAbstractIteratorMod.AbstractValueIteratorOptions
import typings.abstractLevel.typesAbstractLevelMod.AbstractDatabaseOptions
import typings.abstractLevel.typesAbstractSublevelMod.AbstractSublevelOptions
import typings.levelTranscoder.libEncodingMod.IEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abstract-level", "AbstractChainedBatch")
  @js.native
  open class AbstractChainedBatch[TDatabase, KDefault, VDefault] protected ()
    extends typings.abstractLevel.typesAbstractChainedBatchMod.AbstractChainedBatch[TDatabase, KDefault, VDefault] {
    def this(db: TDatabase) = this()
  }
  
  @JSImport("abstract-level", "AbstractIterator")
  @js.native
  open class AbstractIterator[TDatabase, K, V] protected ()
    extends typings.abstractLevel.typesAbstractIteratorMod.AbstractIterator[TDatabase, K, V] {
    def this(db: TDatabase, options: AbstractIteratorOptions[K, V]) = this()
  }
  
  @JSImport("abstract-level", "AbstractKeyIterator")
  @js.native
  open class AbstractKeyIterator[TDatabase, K] protected ()
    extends typings.abstractLevel.typesAbstractIteratorMod.AbstractKeyIterator[TDatabase, K] {
    def this(db: TDatabase, options: AbstractKeyIteratorOptions[K]) = this()
  }
  
  /**
    * Abstract class for a lexicographically sorted key-value database.
    *
    * @template TFormat The type used internally by the database to store data.
    * @template KDefault The default type of keys if not overridden on operations.
    * @template VDefault The default type of values if not overridden on operations.
    */
  @JSImport("abstract-level", "AbstractLevel")
  @js.native
  open class AbstractLevel[TFormat, KDefault, VDefault] protected ()
    extends typings.abstractLevel.typesAbstractLevelMod.AbstractLevel[TFormat, KDefault, VDefault] {
    /**
      * Private database constructor.
      *
      * @param manifest A [manifest](https://github.com/Level/supports) describing the
      * features supported by (the private API of) this database.
      * @param options Options, of which some will be forwarded to {@link open}.
      */
    def this(manifest: PartialIManifest) = this()
    def this(manifest: PartialIManifest, options: AbstractDatabaseOptions[KDefault, VDefault]) = this()
  }
  
  /**
    * @template TDatabase Type of parent database.
    * @template TFormat The type used internally by the parent database to store data.
    * @template KDefault The default type of keys if not overridden on operations.
    * @template VDefault The default type of values if not overridden on operations.
    */
  @JSImport("abstract-level", "AbstractSublevel")
  @js.native
  open class AbstractSublevel[TDatabase, TFormat, KDefault, VDefault] protected ()
    extends typings.abstractLevel.typesAbstractSublevelMod.AbstractSublevel[TDatabase, TFormat, KDefault, VDefault] {
    /**
      * Sublevel constructor.
      *
      * @param db Parent database.
      * @param name Name of the sublevel, used to prefix keys.
      */
    def this(db: TDatabase, name: String) = this()
    def this(db: TDatabase, name: String, options: AbstractSublevelOptions[KDefault, VDefault]) = this()
  }
  
  @JSImport("abstract-level", "AbstractValueIterator")
  @js.native
  open class AbstractValueIterator[TDatabase, K, V] protected ()
    extends typings.abstractLevel.typesAbstractIteratorMod.AbstractValueIterator[TDatabase, K, V] {
    def this(db: TDatabase, options: AbstractValueIteratorOptions[K, V]) = this()
  }
  
  object Transcoder {
    
    /* note: abstract class */ @JSImport("abstract-level", "Transcoder.Encoding")
    @js.native
    open class Encoding[TIn, TFormat, TOut] protected ()
      extends typings.levelTranscoder.mod.Encoding[TIn, TFormat, TOut] {
      def this(options: IEncoding[TIn, TFormat, TOut]) = this()
    }
    
    @JSImport("abstract-level", "Transcoder.Transcoder")
    @js.native
    open class Transcoder[T] protected ()
      extends typings.levelTranscoder.mod.Transcoder[T] {
      /**
        * Create a Transcoder.
        * @param formats Formats supported by consumer.
        */
      def this(formats: js.Array[buffer | view | utf8]) = this()
    }
  }
}
