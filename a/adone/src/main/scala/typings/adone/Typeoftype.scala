package typings.adone

import org.scalablytyped.runtime.Instantiable2
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.Mapping
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.Sequence
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.TypeOptions
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.Type
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftype extends js.Object {
  val Binary: Scalar[Buffer]
  val Bool: Scalar[Boolean]
  val Float: Scalar[Double]
  val INs: js.Any
  val Int: Scalar[Double]
  val Map: Mapping
  val Merge: Scalar[_]
  val Null: Scalar[scala.Null]
  val Omap: Sequence[js.Object]
  val Pairs: Sequence[js.Tuple2[String, _]]
  val Seq: Sequence[_]
  val Set: Mapping
  val Str: Scalar[String]
  val Timestamp: Scalar[Date]
  var Type: Instantiable2[
    /* tag */ String, 
    /* options */ TypeOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
    typings.adone.adoneNs.dataNs.yamlNs.typeNs.Type[js.Object]
  ]
  val jsNs: Typeofjs
}

object Typeoftype {
  @scala.inline
  def apply(
    Binary: Scalar[Buffer],
    Bool: Scalar[Boolean],
    Float: Scalar[Double],
    INs: js.Any,
    Int: Scalar[Double],
    Map: Mapping,
    Merge: Scalar[_],
    Null: Scalar[Null],
    Omap: Sequence[js.Object],
    Pairs: Sequence[js.Tuple2[String, _]],
    Seq: Sequence[_],
    Set: Mapping,
    Str: Scalar[String],
    Timestamp: Scalar[Date],
    Type: Instantiable2[
      /* tag */ String, 
      /* options */ TypeOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
      Type[js.Object]
    ],
    jsNs: Typeofjs
  ): Typeoftype = {
    val __obj = js.Dynamic.literal(Binary = Binary, Bool = Bool, Float = Float, INs = INs, Int = Int, Map = Map, Merge = Merge, Null = Null, Omap = Omap, Pairs = Pairs, Seq = Seq, Set = Set, Str = Str, Timestamp = Timestamp, Type = Type, jsNs = jsNs)
  
    __obj.asInstanceOf[Typeoftype]
  }
}

