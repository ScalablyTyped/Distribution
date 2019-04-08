package typings
package airbnbDashPropDashTypesLib.airbnbDashPropDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val nonNegativeInteger: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def and[T](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[_]]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def and[T](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[_]], name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def and[A, B](
    propTypes: js.Tuple2[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B]
    ]
  ): propDashTypesLib.propDashTypesMod.Requireable[A with B] = js.native
  def and[A, B](
    propTypes: js.Tuple2[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B]
    ],
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[A with B] = js.native
  def and[A, B, C](
    propTypes: js.Tuple3[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B], 
      propDashTypesLib.propDashTypesMod.Validator[C]
    ]
  ): propDashTypesLib.propDashTypesMod.Requireable[A with B with C] = js.native
  def and[A, B, C](
    propTypes: js.Tuple3[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B], 
      propDashTypesLib.propDashTypesMod.Validator[C]
    ],
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[A with B with C] = js.native
  @JSName("and")
  def and_A[A](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[A]]): propDashTypesLib.propDashTypesMod.Requireable[A] = js.native
  @JSName("and")
  def and_A[A](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[A]], name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[A] = js.native
  def between(options: airbnbDashPropDashTypesLib.Anon_Gt): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def booleanSome(props: java.lang.String*): propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  def childrenHavePropXorChildren[T](prop: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def childrenHavePropXorChildren[T](prop: js.Symbol): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def childrenOf[T, P](propType: propDashTypesLib.propDashTypesMod.Validator[P]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def childrenOfType[T](types: ReactTypeLike*): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def childrenSequenceOf[T](specifiers: Specifier[_]*): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def componentWithName[T](name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def componentWithName[T](name: java.lang.String, options: airbnbDashPropDashTypesLib.Anon_StripHOCs): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def componentWithName[T](name: stdLib.RegExp): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def componentWithName[T](name: stdLib.RegExp, options: airbnbDashPropDashTypesLib.Anon_StripHOCs): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def disallowedIf[T](
    propType: propDashTypesLib.propDashTypesMod.Requireable[T],
    otherPropName: java.lang.String,
    otherPropType: propDashTypesLib.propDashTypesMod.Validator[_]
  ): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def elementType[T](`type`: ReactTypeLike): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def explicitNull(): propDashTypesLib.propDashTypesMod.Requireable[js.UndefOr[scala.Null]] = js.native
  def forbidExtraProps[T /* <: js.Object */](propTypes: propDashTypesLib.propDashTypesMod.ValidationMap[T]): propDashTypesLib.propDashTypesMod.ValidationMap[T] = js.native
  def integer(): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def keysOf[T, P](propType: propDashTypesLib.propDashTypesMod.Validator[P]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def keysOf[T, P](propType: propDashTypesLib.propDashTypesMod.Validator[P], name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def mutuallyExclusiveProps[T](propType: propDashTypesLib.propDashTypesMod.Requireable[T], propNames: java.lang.String*): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def mutuallyExclusiveProps[T](
    // tslint:disable-next-line:unified-signatures
  propType: propDashTypesLib.propDashTypesMod.Validator[T],
    propNames: java.lang.String*
  ): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def mutuallyExclusiveTrueProps(propNames: java.lang.String*): propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  def nChildren[T, P](n: scala.Double): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def nChildren[T, P](n: scala.Double, propType: propDashTypesLib.propDashTypesMod.Validator[P]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def nonNegativeNumber(): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def numericString(): propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  def `object`[T /* <: js.Object */](): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def or[T](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[_ | T]]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def or[T](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[_ | T]], name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def or[A, B](
    propTypes: js.Tuple2[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B]
    ]
  ): propDashTypesLib.propDashTypesMod.Requireable[A | B] = js.native
  def or[A, B](
    propTypes: js.Tuple2[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B]
    ],
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[A | B] = js.native
  def or[A, B, C](
    propTypes: js.Tuple3[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B], 
      propDashTypesLib.propDashTypesMod.Validator[C]
    ]
  ): propDashTypesLib.propDashTypesMod.Requireable[A | B | C] = js.native
  def or[A, B, C](
    propTypes: js.Tuple3[
      propDashTypesLib.propDashTypesMod.Validator[A], 
      propDashTypesLib.propDashTypesMod.Validator[B], 
      propDashTypesLib.propDashTypesMod.Validator[C]
    ],
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[A | B | C] = js.native
  @JSName("or")
  def or_A[A](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[A]]): propDashTypesLib.propDashTypesMod.Requireable[A] = js.native
  @JSName("or")
  def or_A[A](propTypes: js.Array[propDashTypesLib.propDashTypesMod.Validator[A]], name: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[A] = js.native
  def range(): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def range(min: scala.Double): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  def range(min: scala.Double, max: scala.Double): propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  @JSName("range")
  def range_TDouble[T /* <: scala.Double */](): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  @JSName("range")
  def range_TDouble[T /* <: scala.Double */](min: scala.Double): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  @JSName("range")
  def range_TDouble[T /* <: scala.Double */](min: scala.Double, max: scala.Double): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def ref(): propDashTypesLib.propDashTypesMod.Requireable[ReactLegacyRefLike[stdLib.HTMLElement]] = js.native
  def requiredBy[P](requiredByPropName: java.lang.String, propType: propDashTypesLib.propDashTypesMod.Validator[P]): propDashTypesLib.propDashTypesMod.Requireable[P] = js.native
  def requiredBy[P](
    requiredByPropName: java.lang.String,
    propType: propDashTypesLib.propDashTypesMod.Validator[P],
    defaultValue: js.Any
  ): propDashTypesLib.propDashTypesMod.Requireable[P] = js.native
  def restrictedProp[T](): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def restrictedProp[T](
    messageFunction: js.Function5[
      /* props */ js.Object, 
      /* propName */ java.lang.String, 
      /* componentName */ java.lang.String, 
      /* location */ java.lang.String, 
      /* propFullName */ java.lang.String, 
      js.UndefOr[java.lang.String | stdLib.Error]
    ]
  ): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def sequenceOf[T](specifiers: Specifier[_]*): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def shape[T /* <: js.Object */](propTypes: propDashTypesLib.propDashTypesMod.ValidationMap[T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def stringStartsWith(string: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  def uniqueArray[T](): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](propType: propDashTypesLib.propDashTypesMod.Validator[P], mapperOrName: java.lang.String): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](
    propType: propDashTypesLib.propDashTypesMod.Validator[P],
    mapperOrName: java.lang.String,
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](
    propType: propDashTypesLib.propDashTypesMod.Validator[P],
    mapperOrName: js.Function1[/* value */ js.Any, _]
  ): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](
    propType: propDashTypesLib.propDashTypesMod.Validator[P],
    mapperOrName: js.Function1[/* value */ js.Any, _],
    name: java.lang.String
  ): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def valuesOf[T](propType: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[org.scalablytyped.runtime.StringDictionary[T]] = js.native
  def withShape[T /* <: js.Object */, P, S](
    propType: propDashTypesLib.propDashTypesMod.Validator[P],
    propTypes: propDashTypesLib.propDashTypesMod.ValidationMap[S]
  ): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
}

