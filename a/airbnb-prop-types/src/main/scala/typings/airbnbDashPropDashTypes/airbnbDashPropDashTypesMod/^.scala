package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.airbnbDashPropDashTypes.Anon_Gt
import typings.airbnbDashPropDashTypes.Anon_StripHOCs
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.propDashTypes.propDashTypesMod.Validator
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val nonNegativeInteger: Requireable[Double] = js.native
  def and[A](propTypes: js.Array[Validator[A]]): Requireable[A] = js.native
  def and[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = js.native
  def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A with B] = js.native
  def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A with B] = js.native
  def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A with B with C] = js.native
  def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A with B with C] = js.native
  @JSName("and")
  def and_T[T](propTypes: js.Array[Validator[_]]): Requireable[T] = js.native
  @JSName("and")
  def and_T[T](propTypes: js.Array[Validator[_]], name: String): Requireable[T] = js.native
  def between(options: Anon_Gt): Requireable[Double] = js.native
  def booleanSome(props: String*): Requireable[Boolean] = js.native
  def childrenHavePropXorChildren[T](prop: String): Requireable[T] = js.native
  def childrenHavePropXorChildren[T](prop: js.Symbol): Requireable[T] = js.native
  def childrenOf[T, P](propType: Validator[P]): Requireable[T] = js.native
  def childrenOfType[T](types: ReactTypeLike*): Requireable[T] = js.native
  def childrenSequenceOf[T](specifiers: Specifier[_]*): Requireable[T] = js.native
  def componentWithName[T](name: String): Requireable[T] = js.native
  def componentWithName[T](name: String, options: Anon_StripHOCs): Requireable[T] = js.native
  def componentWithName[T](name: RegExp): Requireable[T] = js.native
  def componentWithName[T](name: RegExp, options: Anon_StripHOCs): Requireable[T] = js.native
  def disallowedIf[T](propType: Requireable[T], otherPropName: String, otherPropType: Validator[_]): Requireable[T] = js.native
  def elementType[T](`type`: ReactTypeLike): Requireable[T] = js.native
  def explicitNull(): Requireable[js.UndefOr[Null]] = js.native
  def forbidExtraProps[T /* <: js.Object */](propTypes: ValidationMap[T]): ValidationMap[T] = js.native
  def integer(): Requireable[Double] = js.native
  def keysOf[T, P](propType: Validator[P]): Requireable[T] = js.native
  def keysOf[T, P](propType: Validator[P], name: String): Requireable[T] = js.native
  def mutuallyExclusiveProps[T](propType: Requireable[T], propNames: String*): Requireable[T] = js.native
  def mutuallyExclusiveProps[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = js.native
  def mutuallyExclusiveTrueProps(propNames: String*): Requireable[Boolean] = js.native
  def nChildren[T, P](n: Double): Requireable[T] = js.native
  def nChildren[T, P](n: Double, propType: Validator[P]): Requireable[T] = js.native
  def nonNegativeNumber(): Requireable[Double] = js.native
  def numericString(): Requireable[String] = js.native
  def `object`[T /* <: js.Object */](): Requireable[T] = js.native
  def or[A](propTypes: js.Array[Validator[A]]): Requireable[A] = js.native
  def or[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = js.native
  def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A | B] = js.native
  def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A | B] = js.native
  def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A | B | C] = js.native
  def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A | B | C] = js.native
  @JSName("or")
  def or_T[T](propTypes: js.Array[Validator[_ | T]]): Requireable[T] = js.native
  @JSName("or")
  def or_T[T](propTypes: js.Array[Validator[_ | T]], name: String): Requireable[T] = js.native
  def range(): Requireable[Double] = js.native
  def range(min: Double): Requireable[Double] = js.native
  def range(min: Double, max: Double): Requireable[Double] = js.native
  @JSName("range")
  def range_T_Double[T /* <: Double */](): Requireable[T] = js.native
  @JSName("range")
  def range_T_Double[T /* <: Double */](min: Double): Requireable[T] = js.native
  @JSName("range")
  def range_T_Double[T /* <: Double */](min: Double, max: Double): Requireable[T] = js.native
  def ref[T](): Requireable[ReactLegacyRefLike[T]] = js.native
  def requiredBy[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = js.native
  def requiredBy[P](requiredByPropName: String, propType: Validator[P], defaultValue: js.Any): Requireable[P] = js.native
  def restrictedProp[T](): Requireable[T] = js.native
  def restrictedProp[T](
    messageFunction: js.Function5[
      /* props */ js.Object, 
      /* propName */ String, 
      /* componentName */ String, 
      /* location */ String, 
      /* propFullName */ String, 
      js.UndefOr[String | Error]
    ]
  ): Requireable[T] = js.native
  def sequenceOf[T](specifiers: Specifier[_]*): Requireable[T] = js.native
  def shape[T /* <: js.Object */](propTypes: ValidationMap[T]): Requireable[T] = js.native
  def stringStartsWith(string: String): Requireable[String] = js.native
  def uniqueArray[T](): Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String): Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String, name: String): Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _]): Requireable[js.Array[T]] = js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _], name: String): Requireable[js.Array[T]] = js.native
  def valuesOf[T](propType: Validator[T]): Requireable[StringDictionary[T]] = js.native
  def withShape[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = js.native
}

