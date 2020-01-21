package typings.aqb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AQLfunctions
  *
  * If raw JavaScript values are passed to  statements, they will be wrapped in a matching  declare function automatically.
  * JavaScript strings wrapped in quotation marks will be wrapped in  strings, all other JavaScript strings will be wrapped as simple references(see ref)
  * and throw an Error if they are not well-formed.
  */
@js.native
trait AQLfunctions extends Expression {
  /**
    * Boolean
    *
    * Wraps the given value as an  Boolean literal.
    *
    * qb.bool(value)
    *
    * If the value is truthy, it will be converted to the  Boolean true, otherwise it will be converted to the  Boolean false.
    * If the value is already an  Boolean, its own value will be wrapped instead.
    *
    */
  def bool(value: js.Any): BooleanLiteral = js.native
  def expr(value: js.Any): RawExpression = js.native
  /**
    * declare Function Call
    *
    * Creates a functon call for the given name and arguments.
    *
    * qb.fn(name)(...args)
    *
    * If the values are not already  values, they will be converted automatically.
    * For built-in AQLfunctions, methods with the relevant declare function name are already provided by the query builder.
    *
    * Examples
    *
    * qb.fn('MY::USER::FUNC')(1, 2, 3): MY::USER::FUNC(1, 2, 3)
    *
    * qb.fn('hello')(): hello()
    *
    * qb.RANDOM(): RANDOM()
    *
    * qb.FLOOR(qb.div(5, 2)): FLOOR((5 / 2))
    *
    */
  def fn(functionName: String): js.Function1[/* repeated */ js.Any, FunctionCall] = js.native
  /**
    * Ternary(if / else)
    *
    * Creates a ternary expression from the given values.
    *
    * qb.if(condition, thenDo, elseDo): (condition ? thenDo: elseDo)
    * OR:
    * qbValue.then(thenDo).else(elseDo): (condition ? thenDo: elseDo)
    *
    * If the values are not already  values, they will be converted automatically.
    *
    * Alias: qbValue.then(thenDo).otherwise(elseDo)
    *
    * Examples
    * qb.ref('x').then('y').else('z'): (x ? y: z)
    *
    */
  def `if`(cond: js.Any, `then`: js.Any, otherwise: js.Any): Expression | Double = js.native
  /**
    * Integer
    *
    * Wraps the given value as an  Integer literal.
    *
    * qb.int(value)
    *
    * If the value is not a JavaScript Number, it will be converted first.
    * If the value does not represent a finite integer, an Error will be thrown.
    * If the value is already an  Number or  Integer, its own value will be wrapped instead.
    *
    */
  def int(value: js.Any): IntegerLiteral = js.native
  /**
    * List
    *
    * Wraps the given value as an  List(Array) literal.
    *
    * qb.list(value)
    *
    * If the value is not a JavaScript Array, an Error will be thrown.
    * If the value is already an  List, its own value will be wrapped instead.
    * Any list elements that are not already  values will be converted automatically.
    *
    */
  def list(value: js.Array[_]): ListLiteral = js.native
  /**
    * Number
    *
    * Wraps the given value as an  Number literal.
    *
    * qb.num(value)
    *
    * If the value is not a JavaScript Number, it will be converted first.
    * If the value does not represent a finite number, an Error will be thrown.
    * If the value is already an  Number or  Integer, its own value will be wrapped instead.
    *
    */
  def num(value: js.Any): NumberLiteral = js.native
  /**
    * Object
    *
    * Wraps the given value as an  Object literal.
    *
    * qb.obj(value)
    *
    * If the value is not a JavaScript Object, an Error will be thrown.
    * If the value is already an  Object, its own value will be wrapped instead.
    * Any property values that are not already  values will be converted automatically.
    * Any keys that are quoted strings will be treated as string literals.
    * Any keys that start with the character ":" will be treated as dynamic properties and must be well-formed simple references.
    * Any other keys that need escaping will be quoted if necessary.
    * If you need to pass in raw JavaScript objects that shouldn't be converted according to these rules, you can use the qb declare function directly instead.
    *
    * Examples
    *
    * qb.obj({'some.name': 'value'}): {"some.name": value}
    *
    * qb.obj({hello: world}): {hello: world}
    *
    * qb.obj({'"hello"': world}): {"hello": world}
    *
    * qb.obj({':dynamic': 'props'}): {[dynamic]: props}
    *
    * qb.obj({': invalid': 'key'}): throws an error(invalid is not a well-formed reference)
    *
    */
  def obj(obj: js.Object): ObjectLiteral = js.native
  /**
    * Simple Reference
    *
    * Wraps a given value in an  Simple Reference.
    *
    * qb.ref(value)
    *
    * If the value is not a JavaScript string or not a well-formed simple reference, an Error will be thrown.
    * If the value is an ArangoCollection, its name property will be used instead.
    * If the value is already an  Simple Reference, its value is wrapped instead.
    *
    * Examples
    *
    * Valid values:
    *
    * foo
    *
    * foo.bar
    *
    * foo[*].bar
    *
    * foo.bar.QUX
    *
    * _foo._bar._qux
    *
    * foo1.bar2
    *
    * `foo`.bar
    *
    * foo.`bar`
    *
    * Invalid values:
    *
    * 1foo
    *
    * föö
    *
    * foo bar
    *
    * foo[bar]
    *
    */
  def ref(value: String): SimpleReference = js.native
  /**
    * String
    *
    * Wraps the given value as an  String literal.
    *
    * qb.str(value)
    *
    * If the value is not a JavaScript String, it will be converted first.
    * If the value is a quoted string, it will be treated as a string literal.
    * If the value is an object with a toAQL method, the result of calling that method will be wrapped instead.
    *
    * Examples
    *
    * 23 => "23"
    *
    * "some string" => "some string"
    *
    * '"some string"' => "\"some string\""
    *
    */
  def str(value: js.Any): StringLiteral = js.native
}

