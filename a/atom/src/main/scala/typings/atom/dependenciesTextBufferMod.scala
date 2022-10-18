package typings.atom

import typings.atom.anon.ShouldDestroyOnFileDelete
import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typings.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typings.atom.dependenciesTextBufferSrcTextBufferMod.BufferLoadOptions
import typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBufferFileBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferMod {
  
  @JSImport("atom/dependencies/text-buffer", "Point")
  @js.native
  /** Construct a Point object */
  open class Point ()
    extends typings.atom.dependenciesTextBufferSrcTextBufferMod.Point {
    def this(row: Double) = this()
    def this(row: Double, column: Double) = this()
    def this(row: Unit, column: Double) = this()
  }
  /* static members */
  object Point {
    
    @JSImport("atom/dependencies/text-buffer", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    // Construction
    /**
      *  Create a Point from an array containing two numbers representing the
      *  row and column.
      */
    inline def fromObject(`object`: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    inline def fromObject(`object`: PointCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
    
    // Comparison
    /** Returns the given Point that is earlier in the buffer. */
    inline def min(point1: PointCompatible, point2: PointCompatible): typings.atom.dependenciesTextBufferSrcPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcPointMod.Point]
  }
  
  @JSImport("atom/dependencies/text-buffer", "Range")
  @js.native
  /** Construct a Range object. */
  open class Range ()
    extends typings.atom.dependenciesTextBufferSrcTextBufferMod.Range {
    def this(pointA: PointCompatible) = this()
    def this(pointA: Unit, pointB: PointCompatible) = this()
    def this(pointA: PointCompatible, pointB: PointCompatible) = this()
  }
  /* static members */
  object Range {
    
    @JSImport("atom/dependencies/text-buffer", "Range")
    @js.native
    val ^ : js.Any = js.native
    
    /** Call this with the result of Range::serialize to construct a new Range. */
    inline def deserialize(array: js.Object): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(array.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    
    // Construction
    /** Convert any range-compatible object to a Range. */
    inline def fromObject(`object`: RangeCompatible): typings.atom.dependenciesTextBufferSrcRangeMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
    inline def fromObject(`object`: RangeCompatible, copy: Boolean): typings.atom.dependenciesTextBufferSrcRangeMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcRangeMod.Range]
  }
  
  @JSImport("atom/dependencies/text-buffer", "TextBuffer")
  @js.native
  /** Create a new buffer with the given params. */
  open class TextBuffer ()
    extends typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer {
    def this(params: ShouldDestroyOnFileDelete) = this()
    /** Create a new buffer with the given starting text. */
    def this(text: String) = this()
  }
  /* static members */
  object TextBuffer {
    
    @JSImport("atom/dependencies/text-buffer", "TextBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Restore a TextBuffer based on an earlier state created using the
      *  TextBuffer::serialize method.
      */
    inline def deserialize(params: js.Object): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /** Create a new buffer backed by the given file path. */
    inline def load(filePath: String): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: String, params: BufferLoadOptions): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    inline def load(filePath: TextBufferFileBackend, params: BufferLoadOptions): js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]]
    
    /**
      *  Create a new buffer backed by the given file path. For better performance,
      *  use TextBuffer.load instead.
      */
    inline def loadSync(filePath: String): typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
    inline def loadSync(filePath: String, params: BufferLoadOptions): typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filePath.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.atom.dependenciesTextBufferSrcTextBufferMod.TextBuffer]
  }
}
