package typings.airbnbPropTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.airbnbPropTypes.anon.Gt
import typings.airbnbPropTypes.anon.StripHOCs
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("airbnb-prop-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and[T](propTypes: js.Array[Validator[Any]]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def and[T](propTypes: js.Array[Validator[Any]], name: String): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  inline def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A & B] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A & B]]
  inline def and[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A & B] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A & B]]
  inline def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A & B & C] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A & B & C]]
  inline def and[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A & B & C] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A & B & C]]
  
  inline def and_A[A](propTypes: js.Array[Validator[A]]): Requireable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A]]
  inline def and_A[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A]]
  
  inline def between(options: Gt): Requireable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(options.asInstanceOf[js.Any]).asInstanceOf[Requireable[Double]]
  
  inline def booleanSome(props: String*): Requireable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("booleanSome")(props.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Requireable[Boolean]]
  
  inline def childrenHavePropXorChildren[T](prop: String): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenHavePropXorChildren")(prop.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def childrenHavePropXorChildren[T](prop: js.Symbol): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenHavePropXorChildren")(prop.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def childrenOf[T, P](propType: Validator[P]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenOf")(propType.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def childrenOfType[T](types: ReactTypeLike*): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenOfType")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Requireable[T]]
  
  inline def childrenSequenceOf[T](specifiers: Specifier[Any]*): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("childrenSequenceOf")(specifiers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Requireable[T]]
  
  inline def componentWithName[T](name: String): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWithName")(name.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def componentWithName[T](name: String, options: StripHOCs): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("componentWithName")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  inline def componentWithName[T](name: js.RegExp): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWithName")(name.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def componentWithName[T](name: js.RegExp, options: StripHOCs): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("componentWithName")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  inline def disallowedIf[T](propType: Requireable[T], otherPropName: String, otherPropType: Validator[Any]): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("disallowedIf")(propType.asInstanceOf[js.Any], otherPropName.asInstanceOf[js.Any], otherPropType.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  inline def elementType[T](`type`: ReactTypeLike): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def explicitNull(): Requireable[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("explicitNull")().asInstanceOf[Requireable[js.UndefOr[Null]]]
  
  inline def forbidExtraProps[T /* <: js.Object */](propTypes: ValidationMap[T]): ValidationMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidExtraProps")(propTypes.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[T]]
  
  inline def integer(): Requireable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[Requireable[Double]]
  
  inline def keysOf[T, P](propType: Validator[P]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keysOf")(propType.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def keysOf[T, P](propType: Validator[P], name: String): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("keysOf")(propType.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  inline def mutuallyExclusiveProps[T](propType: Requireable[T], propNames: String*): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mutuallyExclusiveProps")(scala.List(propType.asInstanceOf[js.Any]).`++`(propNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Requireable[T]]
  inline def mutuallyExclusiveProps[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mutuallyExclusiveProps")(scala.List(propType.asInstanceOf[js.Any]).`++`(propNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Requireable[T]]
  
  inline def mutuallyExclusiveTrueProps(propNames: String*): Requireable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("mutuallyExclusiveTrueProps")(propNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Requireable[Boolean]]
  
  inline def nChildren[T, P](n: Double): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nChildren")(n.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def nChildren[T, P](n: Double, propType: Validator[P]): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nChildren")(n.asInstanceOf[js.Any], propType.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  @JSImport("airbnb-prop-types", "nonNegativeInteger")
  @js.native
  val nonNegativeInteger: Requireable[Double] = js.native
  
  inline def nonNegativeNumber(): Requireable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNegativeNumber")().asInstanceOf[Requireable[Double]]
  
  inline def numericString(): Requireable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("numericString")().asInstanceOf[Requireable[String]]
  
  inline def `object`[T /* <: js.Object */](): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Requireable[T]]
  
  inline def or[T](propTypes: js.Array[Validator[Any | T]]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def or[T](propTypes: js.Array[Validator[Any | T]], name: String): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  inline def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A | B] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A | B]]
  inline def or[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A | B]]
  inline def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A | B | C] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A | B | C]]
  inline def or[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A | B | C]]
  
  inline def or_A[A](propTypes: js.Array[Validator[A]]): Requireable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[A]]
  inline def or_A[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(propTypes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[A]]
  
  inline def range(): Requireable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[Requireable[Double]]
  inline def range(min: Double): Requireable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any]).asInstanceOf[Requireable[Double]]
  inline def range(min: Double, max: Double): Requireable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Requireable[Double]]
  inline def range(min: Unit, max: Double): Requireable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Requireable[Double]]
  
  inline def range_T[T /* <: Double */](): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[Requireable[T]]
  inline def range_T[T /* <: Double */](min: Double): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  inline def range_T[T /* <: Double */](min: Double, max: Double): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  inline def range_T[T /* <: Double */](min: Unit, max: Double): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  inline def ref[T](): Requireable[ReactLegacyRefLike[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")().asInstanceOf[Requireable[ReactLegacyRefLike[T]]]
  
  inline def requiredBy[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("requiredBy")(requiredByPropName.asInstanceOf[js.Any], propType.asInstanceOf[js.Any])).asInstanceOf[Requireable[P]]
  inline def requiredBy[P](requiredByPropName: String, propType: Validator[P], defaultValue: Any): Requireable[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("requiredBy")(requiredByPropName.asInstanceOf[js.Any], propType.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Requireable[P]]
  
  inline def restrictedProp[T](): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictedProp")().asInstanceOf[Requireable[T]]
  inline def restrictedProp[T](
    messageFunction: js.Function5[
      /* props */ js.Object, 
      /* propName */ String, 
      /* componentName */ String, 
      /* location */ String, 
      /* propFullName */ String, 
      js.UndefOr[String | js.Error]
    ]
  ): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictedProp")(messageFunction.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def sequenceOf[T](specifiers: Specifier[Any]*): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceOf")(specifiers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Requireable[T]]
  
  inline def shape[T /* <: js.Object */](propTypes: ValidationMap[T]): Requireable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")(propTypes.asInstanceOf[js.Any]).asInstanceOf[Requireable[T]]
  
  inline def stringStartsWith(string: String): Requireable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringStartsWith")(string.asInstanceOf[js.Any]).asInstanceOf[Requireable[String]]
  
  inline def uniqueArray[T](): Requireable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueArray")().asInstanceOf[Requireable[js.Array[T]]]
  
  inline def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String): Requireable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueArrayOf")(propType.asInstanceOf[js.Any], mapperOrName.asInstanceOf[js.Any])).asInstanceOf[Requireable[js.Array[T]]]
  inline def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: String, name: String): Requireable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueArrayOf")(propType.asInstanceOf[js.Any], mapperOrName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[js.Array[T]]]
  inline def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ Any, Any]): Requireable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueArrayOf")(propType.asInstanceOf[js.Any], mapperOrName.asInstanceOf[js.Any])).asInstanceOf[Requireable[js.Array[T]]]
  inline def uniqueArrayOf[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ Any, Any], name: String): Requireable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueArrayOf")(propType.asInstanceOf[js.Any], mapperOrName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Requireable[js.Array[T]]]
  
  inline def valuesOf[T](propType: Validator[T]): Requireable[StringDictionary[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("valuesOf")(propType.asInstanceOf[js.Any]).asInstanceOf[Requireable[StringDictionary[T]]]
  
  inline def withShape[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withShape")(propType.asInstanceOf[js.Any], propTypes.asInstanceOf[js.Any])).asInstanceOf[Requireable[T]]
  
  @js.native
  trait ReactClassComponentLike
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, ReactComponentLike]
       with _ReactTypeLike
  
  trait ReactComponentLike extends StObject {
    
    var context: Any
    
    def forceUpdate(args: Any*): Any
    
    var props: Any
    
    var refs: Any
    
    def render(): ReactNodeLike
    
    def setState(args: Any*): Any
    
    var state: Any
  }
  object ReactComponentLike {
    
    inline def apply(
      context: Any,
      forceUpdate: /* repeated */ Any => Any,
      props: Any,
      refs: Any,
      render: () => ReactNodeLike,
      setState: /* repeated */ Any => Any,
      state: Any
    ): ReactComponentLike = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction1(forceUpdate), props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactComponentLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactComponentLike] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction1(value))
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRefs(value: Any): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRender(value: () => ReactNodeLike): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setSetState(value: /* repeated */ Any => Any): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactFunctionComponentLike
    extends StObject
       with _ReactTypeLike {
    
    def apply(args: Any*): ReactNodeLike = js.native
  }
  
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | Null, Unit]) | ReactRefLike[T]
  
  trait ReactRefLike[T] extends StObject {
    
    val current: T | Null
  }
  object ReactRefLike {
    
    inline def apply[T](): ReactRefLike[T] = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[ReactRefLike[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactRefLike[?], T] (val x: Self & ReactRefLike[T]) extends AnyVal {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.airbnbPropTypes.mod.ReactClassComponentLike
    - typings.airbnbPropTypes.mod.ReactFunctionComponentLike
  */
  type ReactTypeLike = _ReactTypeLike | String
  
  trait Specifier[T] extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    def validator(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null
    @JSName("validator")
    var validator_Original: Validator[T]
  }
  object Specifier {
    
    inline def apply[T](validator: Validator[T]): Specifier[T] = {
      val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specifier[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Specifier[?], T] (val x: Self & Specifier[T]) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setValidator(value: Validator[T]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ReactTypeLike extends StObject
}
