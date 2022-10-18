package typings.antvCoord

import typings.antvCoord.anon.PartialOptions
import typings.antvCoord.libTypeMod.Options
import typings.antvCoord.libTypeMod.Transformation
import typings.antvCoord.libTypeMod.Vector
import typings.antvCoord.libTypeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoordinateMod {
  
  @JSImport("@antv/coord/lib/coordinate", "Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate () extends StObject {
    def this(options: PartialOptions) = this()
    
    /**
      * Clear transformations and update.
      */
    def clear(): Unit = js.native
    
    /* private */ var compose: Any = js.native
    
    /* private */ var createMatrixTransform: Any = js.native
    
    /**
      * Returns the center of the bounding box of the coordinate.
      * @returns [centerX, centerY]
      */
    def getCenter(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns current options.
      * @returns options
      */
    def getOptions(): Options = js.native
    
    /**
      * Returns the size of the bounding box of the coordinate.
      * @returns [width, height]
      */
    def getSize(): js.Tuple2[Double, Double] = js.native
    
    /* private */ var input: Any = js.native
    
    def invert(vector: Vector): Vector2 | Vector = js.native
    /**
      * Apples invert transformations for the current vector.
      * @param vector transformed vector2
      * @param vector original vector2
      */
    def invert(vector: Vector2): Vector2 | Vector = js.native
    
    def map(vector: Vector): Vector2 | Vector = js.native
    /**
      * Apples transformations for the current vector.
      * @param vector original vector2
      * @returns transformed vector2
      */
    def map(vector: Vector2): Vector2 | Vector = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var output: Any = js.native
    
    /* private */ var recoordinate: Any = js.native
    
    /**
      * Add selected transformation.
      * @param args transform type and params
      * @returns Coordinate
      */
    def transform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Transformation is not an array type */ args: Transformation
    ): this.type = js.native
    
    /* private */ var transformers: Any = js.native
    
    /**
      * Update options and inner state.
      * @param options Options to be updated
      */
    def update(options: PartialOptions): Unit = js.native
  }
}
