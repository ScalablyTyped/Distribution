package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends PartialStatement {
  /**
       * Addition
       *
       * Creates an addition operation from the given values.
       *
       * qb.add(a, b): (a + b)
       * OR:
       * Value.add(b): (a + b)
       *
       * If the values are not already  values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Alias: qb.plus(a, b)
       *
       * Examples
       *
       * qb.ref('x').plus('y'): (x + y)
       */
  def add(x: js.Any*): NAryOperation = js.native
  /**
       * Boolean And
       *
       * Creates an "and" operation from the given values.
       *
       * qb.and(a, b) =>(a && b)
       * OR:
       * aqlValue.and(b) =>(a && b)
       *
       * If the values are not already AQL values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Examples
       *
       * qb.ref('x').and('y') =>(x && y)
       */
  def and(x: js.Any*): NAryOperation = js.native
  /**
       * Division
       *
       * Creates a division operation from the given values.
       *
       * qb.div(a, b): (a / b)
       * OR:
       * Value.div(b): (a / b)
       *
       * If the values are not already  values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Examples
       * qb.ref('x').div('y'): (x / y)
       */
  def div(x: js.Any*): NAryOperation = js.native
  /**
       * Equality
       *
       * Creates an equality comparison from the given values.
       *
       * qb.eq(a, b): (a == b)
       * OR:
       * qbValue.eq(b): (a == b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').eq('y'): (x == y)
       *
       *
       */
  def eq(x: js.Any): BinaryOperation = js.native
  /**
       * Equality
       *
       * Creates an equality comparison from the given values.
       *
       * qb.eq(a, b): (a == b)
       * OR:
       * qbValue.eq(b): (a == b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').eq('y'): (x == y)
       *
       *
       */
  def eq(x: js.Any, y: js.Any): BinaryOperation = js.native
  /**
       * Property Access
       *
       * Creates a property access expression from the given values.
       *
       * qb.get(obj, key): obj[key]
       * OR:
       * Obj.get(key): obj[key]
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       * qb.ref('x').get('y'): x[y]`
       *
       */
  def get(value: js.Any): PropertyAccess = js.native
  /**
       * Greater Than
       *
       * Creates a greater-than comparison from the given values.
       *
       * qb.gt(a, b): (a > b)
       * OR
       * qbValue.gt(b): (a > b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       *  qb.ref('x').gt('y'): (x > y)
       *
       *
       */
  def gt(x: js.Any): BinaryOperation = js.native
  /**
       * Greater Than
       *
       * Creates a greater-than comparison from the given values.
       *
       * qb.gt(a, b): (a > b)
       * OR
       * qbValue.gt(b): (a > b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       *  qb.ref('x').gt('y'): (x > y)
       *
       *
       */
  def gt(x: js.Any, y: js.Any): BinaryOperation = js.native
  /**
       * Greater Than Or Equal To
       *
       * Creates a greater-than-or-equal-to comparison from the given values.
       *
       * qb.gte(a, b): (a >= b)
       * OR
       * qbValue.gte(b): (a >= b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').gte('y'): (x >= y)
       *
       *
       */
  def gte(x: js.Any): BinaryOperation = js.native
  /**
       * Greater Than Or Equal To
       *
       * Creates a greater-than-or-equal-to comparison from the given values.
       *
       * qb.gte(a, b): (a >= b)
       * OR
       * qbValue.gte(b): (a >= b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').gte('y'): (x >= y)
       *
       *
       */
  def gte(x: js.Any, y: js.Any): BinaryOperation = js.native
  /**
       * Contains
       *
       * Creates an "in" comparison from the given values.
       *
       * qb.in(a, b): (a in b)
       * OR:
       * qbValue.in(b): (a in b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       * qb.ref('x').in('y'): (x in y)
       */
  def in(x: js.Any*): BinaryOperation = js.native
  /**
       * Less Than
       *
       * Creates a less-than comparison from the given values.
       *
       * qb.lt(a, b): (a < b)
       * OR
       * qbValue.lt(b): (a < b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').lt('y'): (x < y)
       *
       */
  def lt(x: js.Any): BinaryOperation = js.native
  /**
       * Less Than
       *
       * Creates a less-than comparison from the given values.
       *
       * qb.lt(a, b): (a < b)
       * OR
       * qbValue.lt(b): (a < b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').lt('y'): (x < y)
       *
       */
  def lt(x: js.Any, y: js.Any): BinaryOperation = js.native
  /**
       * Less Than Or Equal To
       *
       * Creates a less-than-or-equal-to comparison from the given values.
       *
       * qb.lte(a, b): (a <= b)
       * OR
       * qbValue.lte(b): (a <= b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').lte('y'): (x <= y)
       *
       */
  def lte(x: js.Any): BinaryOperation = js.native
  /**
       * Less Than Or Equal To
       *
       * Creates a less-than-or-equal-to comparison from the given values.
       *
       * qb.lte(a, b): (a <= b)
       * OR
       * qbValue.lte(b): (a <= b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').lte('y'): (x <= y)
       *
       */
  def lte(x: js.Any, y: js.Any): BinaryOperation = js.native
  def minus(x: js.Any*): NAryOperation = js.native
  /**
       * Modulus
       *
       * Creates a modulus operation from the given values.
       *
       * qb.mod(a, b): (a % b)
       * OR:
       * Value.mod(b): (a % b)
       *
       * If the values are not already  values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Examples
       * qb.ref('x').mod('y'): (x % y)
       */
  def mod(x: js.Any*): NAryOperation = js.native
  /**
       * Multiplication
       *
       * Creates a multiplication operation from the given values.
       *
       * qb.mul(a, b): (a * b)
       * OR:
       * Value.mul(b): (a * b)
       *
       * If the values are not already  values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Alias: qb.times(a, b)
       *
       * Examples
       *
       * qb.ref('x').times('y'): (x * y)
       */
  def mul(x: js.Any*): NAryOperation = js.native
  /**
       * Negative Value
       *
       * Creates a negative value expression from the given value.
       *
       * qb.neg(a) => -(a)
       * OR:
       * qbValue.neg() => -(a)
       *
       * If the value is not already an AQL value, it will be converted automatically.
       *
       * Examples
       *
       * qb.neg('x') => -(x)
       */
  def neg(): UnaryOperation = js.native
  /**
       * Negative Value
       *
       * Creates a negative value expression from the given value.
       *
       * qb.neg(a) => -(a)
       * OR:
       * qbValue.neg() => -(a)
       *
       * If the value is not already an AQL value, it will be converted automatically.
       *
       * Examples
       *
       * qb.neg('x') => -(x)
       */
  def neg(x: js.Any): UnaryOperation = js.native
  /**
       * Inequality
       *
       * Creates an inequality comparison from the given values.
       *
       * qb.neq(a, b): (a != b)
       * OR:
       * qbValue.neq(b): (a != b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').neq('y'): (x != y)
       *
       */
  def neq(x: js.Any): BinaryOperation = js.native
  /**
       * Inequality
       *
       * Creates an inequality comparison from the given values.
       *
       * qb.neq(a, b): (a != b)
       * OR:
       * qbValue.neq(b): (a != b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').neq('y'): (x != y)
       *
       */
  def neq(x: js.Any, y: js.Any): BinaryOperation = js.native
  /**
       * Negation
       *
       * Creates a negation from the given value.
       *
       * qb.not(a) => !(a)
       * OR:
       * qbValue.not() => !(a)
       *
       * If the value is not already an  value, it will be converted automatically.
       *
       * Examples
       *
       * qb.not('x') => !(x)
       */
  def not(): UnaryOperation = js.native
  /**
       * Negation
       *
       * Creates a negation from the given value.
       *
       * qb.not(a) => !(a)
       * OR:
       * qbValue.not() => !(a)
       *
       * If the value is not already an  value, it will be converted automatically.
       *
       * Examples
       *
       * qb.not('x') => !(x)
       */
  def not(x: js.Any): UnaryOperation = js.native
  /**
       * Negated Contains
       *
       * Creates a "not in" comparison from the given values.
       *
       * qb.notIn(a, b): (a not in b)
       * OR:
       * qbValue.notIn(b): (a not in b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * Examples
       *
       * qb.ref('x').notIn('y'): (x not in y)
       */
  def notIn(x: js.Any*): BinaryOperation = js.native
  /**
       * Boolean Or
       *
       * Creates an "or" operation from the given values.
       *
       * qb.or(a, b): (a || b)
       * OR:
       * Value.or(b): (a || b)
       *
       * If the values are not already  values, they will be converted automatically.
       *
       * This declare function can take any number of arguments.
       */
  def or(x: js.Any*): NAryOperation = js.native
  def plus(x: js.Any*): NAryOperation = js.native
  /**
       * Range
       *
       * Creates a range expression from the given values.
       *
       * qb.range(value1, value2): value1..value2
       *
       * OR:
       *
       * Value.range(value2): value1..value2
       *
       * If the values are not already  values, they will be converted automatically.
       * Alias: qb.to(value1, value2)
       *
       * Examples
       *
       * qb(2).to(5): 2..5
       *
       */
  def range(value: scala.Double*): RangeExpression = js.native
  /**
       * Subtraction
       *
       * Creates a subtraction operation from the given values.
       *
       * qb.sub(a, b): (a - b)
       * OR:
       * Value.sub(b): (a - b)
       *
       * If the values are not already  values, they will be converted automatically.
       * This declare function can take any number of arguments.
       *
       * Alias: qb.minus(a, b)
       *
       * Examples
       *
       * qb.ref('x').minus('y'): (x - y)
       */
  def sub(x: js.Any*): NAryOperation = js.native
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
  def `then`(value: js.Any): ThenRet = js.native
  def times(x: js.Any*): NAryOperation = js.native
}

