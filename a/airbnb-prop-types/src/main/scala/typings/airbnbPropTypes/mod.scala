package typings.airbnbPropTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.airbnbPropTypes.anon.Gt
import typings.airbnbPropTypes.anon.StripHOCs
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[T](propTypes: js.Array[Validator[_]]): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[T](propTypes: js.Array[Validator[_]], name: String): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A with B] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A with B] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A with B with C] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A with B with C] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and_A[A](propTypes: js.Array[Validator[A]]): Requireable[A] = js.native
  @JSImport("airbnb-prop-types", "and")
  @js.native
  def and_A[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = js.native
  
  @JSImport("airbnb-prop-types", "between")
  @js.native
  def between(options: Gt): Requireable[Double] = js.native
  
  @JSImport("airbnb-prop-types", "booleanSome")
  @js.native
  def booleanSome(props: String*): Requireable[Boolean] = js.native
  
  @JSImport("airbnb-prop-types", "childrenHavePropXorChildren")
  @js.native
  def childrenHavePropXorChildren[T](prop: String): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "childrenHavePropXorChildren")
  @js.native
  def childrenHavePropXorChildren[T](prop: js.Symbol): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "childrenOf")
  @js.native
  def childrenOf[T, P](propType: Validator[P]): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "childrenOfType")
  @js.native
  def childrenOfType[T](types: ReactTypeLike*): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "childrenSequenceOf")
  @js.native
  def childrenSequenceOf[T](specifiers: Specifier[_]*): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "componentWithName")
  @js.native
  def componentWithName[T](name: String): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "componentWithName")
  @js.native
  def componentWithName[T](name: String, options: StripHOCs): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "componentWithName")
  @js.native
  def componentWithName[T](name: RegExp): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "componentWithName")
  @js.native
  def componentWithName[T](name: RegExp, options: StripHOCs): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "disallowedIf")
  @js.native
  def disallowedIf[T](propType: Requireable[T], otherPropName: String, otherPropType: Validator[_]): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "elementType")
  @js.native
  def elementType[T](`type`: ReactTypeLike): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "explicitNull")
  @js.native
  def explicitNull(): Requireable[js.UndefOr[Null]] = js.native
  
  @JSImport("airbnb-prop-types", "forbidExtraProps")
  @js.native
  def forbidExtraProps[T /* <: js.Object */](propTypes: ValidationMap[T]): ValidationMap[T] = js.native
  
  @JSImport("airbnb-prop-types", "integer")
  @js.native
  def integer(): Requireable[Double] = js.native
  
  @JSImport("airbnb-prop-types", "keysOf")
  @js.native
  def keysOf[T, P](propType: Validator[P]): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "keysOf")
  @js.native
  def keysOf[T, P](propType: Validator[P], name: String): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "mutuallyExclusiveProps")
  @js.native
  def mutuallyExclusiveProps[T](propType: Requireable[T], propNames: String*): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "mutuallyExclusiveProps")
  @js.native
  def mutuallyExclusiveProps[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "mutuallyExclusiveTrueProps")
  @js.native
  def mutuallyExclusiveTrueProps(propNames: String*): Requireable[Boolean] = js.native
  
  @JSImport("airbnb-prop-types", "nChildren")
  @js.native
  def nChildren[T, P](n: Double): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "nChildren")
  @js.native
  def nChildren[T, P](n: Double, propType: Validator[P]): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "nonNegativeInteger")
  @js.native
  val nonNegativeInteger: Requireable[Double] = js.native
  
  @JSImport("airbnb-prop-types", "nonNegativeNumber")
  @js.native
  def nonNegativeNumber(): Requireable[Double] = js.native
  
  @JSImport("airbnb-prop-types", "numericString")
  @js.native
  def numericString(): Requireable[String] = js.native
  
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[T](propTypes: js.Array[Validator[_ | T]]): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[T](propTypes: js.Array[Validator[_ | T]], name: String): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A | B] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A | B] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A | B | C] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A | B | C] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or_A[A](propTypes: js.Array[Validator[A]]): Requireable[A] = js.native
  @JSImport("airbnb-prop-types", "or")
  @js.native
  def or_A[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = js.native
  
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range(): Requireable[Double] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range(min: js.UndefOr[scala.Nothing], max: Double): Requireable[Double] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range(min: Double): Requireable[Double] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range(min: Double, max: Double): Requireable[Double] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range_T_Double[T /* <: Double */](): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range_T_Double[T /* <: Double */](min: js.UndefOr[scala.Nothing], max: Double): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range_T_Double[T /* <: Double */](min: Double): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "range")
  @js.native
  def range_T_Double[T /* <: Double */](min: Double, max: Double): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "ref")
  @js.native
  def ref[T](): Requireable[ReactLegacyRefLike[T]] = js.native
  
  @JSImport("airbnb-prop-types", "requiredBy")
  @js.native
  def requiredBy[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = js.native
  @JSImport("airbnb-prop-types", "requiredBy")
  @js.native
  def requiredBy[P](requiredByPropName: String, propType: Validator[P], defaultValue: js.Any): Requireable[P] = js.native
  
  @JSImport("airbnb-prop-types", "restrictedProp")
  @js.native
  def restrictedProp[T](): Requireable[T] = js.native
  @JSImport("airbnb-prop-types", "restrictedProp")
  @js.native
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
  
  @JSImport("airbnb-prop-types", "sequenceOf")
  @js.native
  def sequenceOf[T](specifiers: Specifier[_]*): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "shape")
  @js.native
  def shape[T /* <: js.Object */](propTypes: ValidationMap[T]): Requireable[T] = js.native
  
  @JSImport("airbnb-prop-types", "stringStartsWith")
  @js.native
  def stringStartsWith(string: String): Requireable[String] = js.native
  
  @JSImport("airbnb-prop-types", "uniqueArray")
  @js.native
  def uniqueArray[T](): Requireable[js.Array[T]] = js.native
  
  @JSImport("airbnb-prop-types", "uniqueArrayOf")
  @js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String): Requireable[js.Array[T]] = js.native
  @JSImport("airbnb-prop-types", "uniqueArrayOf")
  @js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String, name: String): Requireable[js.Array[T]] = js.native
  @JSImport("airbnb-prop-types", "uniqueArrayOf")
  @js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _]): Requireable[js.Array[T]] = js.native
  @JSImport("airbnb-prop-types", "uniqueArrayOf")
  @js.native
  def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _], name: String): Requireable[js.Array[T]] = js.native
  
  @JSImport("airbnb-prop-types", "valuesOf")
  @js.native
  def valuesOf[T](propType: Validator[T]): Requireable[StringDictionary[T]] = js.native
  
  @JSImport("airbnb-prop-types", "withShape")
  @js.native
  def withShape[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = js.native
  
  @js.native
  trait ReactClassComponentLike
    extends Instantiable1[/* args (repeated) */ js.Any, ReactComponentLike]
  
  @js.native
  trait ReactComponentLike extends StObject {
    
    var context: js.Any = js.native
    
    def forceUpdate(args: js.Any*): js.Any = js.native
    
    var props: js.Any = js.native
    
    var refs: js.Any = js.native
    
    def render(): ReactNodeLike = js.native
    
    def setState(args: js.Any*): js.Any = js.native
    
    var state: js.Any = js.native
  }
  object ReactComponentLike {
    
    @scala.inline
    def apply(
      context: js.Any,
      forceUpdate: /* repeated */ js.Any => js.Any,
      props: js.Any,
      refs: js.Any,
      render: () => ReactNodeLike,
      setState: /* repeated */ js.Any => js.Any,
      state: js.Any
    ): ReactComponentLike = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction1(forceUpdate), props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactComponentLike]
    }
    
    @scala.inline
    implicit class ReactComponentLikeMutableBuilder[Self <: ReactComponentLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefs(value: js.Any): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: () => ReactNodeLike): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, ReactNodeLike]
  
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | Null, Unit]) | ReactRefLike[T]
  
  @js.native
  trait ReactRefLike[T] extends StObject {
    
    val current: T | Null = js.native
  }
  object ReactRefLike {
    
    @scala.inline
    def apply[T](): ReactRefLike[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactRefLike[T]]
    }
    
    @scala.inline
    implicit class ReactRefLikeMutableBuilder[Self <: ReactRefLike[_], T] (val x: Self with ReactRefLike[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  type ReactTypeLike = String | ReactClassComponentLike | ReactFunctionComponentLike
  
  @js.native
  trait Specifier[T] extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    def validator(
      props: StringDictionary[js.Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): Error | Null = js.native
    @JSName("validator")
    var validator_Original: Validator[T] = js.native
  }
  
  @JSImport("airbnb-prop-types", "object")
  @js.native
  def `object`[T /* <: js.Object */](): Requireable[T] = js.native
}
